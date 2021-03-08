package com.example.helloworld;

import java.util.*;

class NameOfPerson implements Comparable<NameOfPerson>{
    private String name;
    public NameOfPerson(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(NameOfPerson p) {
        int l1=name.length();
        int l2=p.name.length();
        //return Integer.compare(l1,l2);//set neglects one string with same length
        if(l1>l2)
            return 1;
        else if(l1<l2)
            return -1;
        else
            return name.compareTo(p.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameOfPerson that = (NameOfPerson) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class ListAndSetNaturalOrdering {
    public static void main(String [] args){
        List<NameOfPerson> list=new ArrayList<>();
        Set<NameOfPerson> set=new TreeSet<>();
        System.out.println("Elements of set");
        addElements(set);
        showElements(set);
        System.out.println("Elements of list");
        addElements(list);
        Collections.sort(list);
        showElements(list);
    }
    public static void addElements(Collection<NameOfPerson>col){
        col.add(new NameOfPerson("Vijay"));
        col.add(new NameOfPerson("Sue"));
        col.add(new NameOfPerson("Ajit"));
        col.add(new NameOfPerson("Surya"));
        col.add(new NameOfPerson("Lal"));
    }
    public static void showElements(Collection<NameOfPerson>col){
        for(NameOfPerson n:col){
            System.out.println(n);
        }
    }
}
