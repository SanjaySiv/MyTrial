package com.example.helloworld;

import java.util.Comparator;
import java.util.TreeMap;

class StudentDetailsShow{
    int id;
    String name,address;
    public StudentDetailsShow(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return id+" "+name+" "+address;
    }
}
class SortById implements Comparator<StudentDetailsShow> {

    @Override
    public int compare(StudentDetailsShow o1, StudentDetailsShow o2) {
        return o1.id-o2.id;
    }
}
public class TreeMapComparator {
    public static void main(String[] ags){
        StudentDetailsShow s=new StudentDetailsShow(100,"first","India");
        TreeMap<StudentDetailsShow,Integer>map=new TreeMap<>(new SortById());
        map.put(new StudentDetailsShow(111, "bbbb", "london"), 2);
        map.put(new StudentDetailsShow(131, "aaaa", "nyc"), 3);
        map.put(new StudentDetailsShow(121, "cccc", "jaipur"), 1);
        map.put(new StudentDetailsShow(145, "bbbb", "london"), 6);
        map.put(new StudentDetailsShow(123, "aaaa", "nyc"), 10);
        map.put(new StudentDetailsShow(118, "cccc", "jaipur"), 4);
        map.put(s,5);
        System.out.println(map);
    }
}
