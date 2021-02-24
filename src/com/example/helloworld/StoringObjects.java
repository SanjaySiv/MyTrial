package com.example.helloworld;

import java.util.*;

class Members{
    private final int id;
    private final String name;
    public Members(int id,String  name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "id : "+id+"; name : "+name;
    }
    //hashcode() and equals() methods helps to neglects the copy objects to store to map and set but not for list
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Members members = (Members) o;
        return id == members.id && name.equals(members.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class StoringObjects {
    public static void main(String[] args){
        Members m1=new Members(5,"Father");
        Members m2=new Members(3,"Son");
        Members m5=new Members(6,"Daughter");
        Members m3=new Members(7,"Grand Father");
        Members m4=new Members(1,"Mother");
        Members m6=new Members(2,"Grand Mother");
        Members m7=new Members(6,"Daughter");//copy of m5
        System.out.println("Storing objects to map");
        Map<Members,Integer>map=new LinkedHashMap<>();
        map.put(m1,4);
        map.put(m2,1);
        map.put(m3,2);
        map.put(m4,6);
        map.put(m5,7);
        map.put(m6,3);
        map.put(m7,7);//copy of m5
        for(Members key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println("Storing objects to set");
        Set<Members>set=new LinkedHashSet<>();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        set.add(m5);
        set.add(m6);
        set.add(m7);//copy of m5
        System.out.println(set);
        System.out.println("Storing objects to list");
        List<Members>list=new LinkedList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);
        list.add(m7);//copy of m5
        System.out.println(list);
        //even though we use equals and hashcode list contains copy of m5
    }
}
