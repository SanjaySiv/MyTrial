package com.example.helloworld;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args){
        ArrayList<Integer>arrayList=new ArrayList<>();
        LinkedList<Integer>linkedList=new LinkedList<>();
        timingCalc("ArrayList",arrayList);
        timingCalc("LinkedList",linkedList);
    }
    public static void timingCalc(String type, List<Integer>list){
        for(int i=0;i<1E5;i++){
            list.add(i);
        }
        long start=System.currentTimeMillis();
        //adding elements at the end of the list----- ArrayList is faster
        /*for(int i=0;i<10;i++){
            list.add(i);
        }*/
        //adding elements athe beginning of the list---- LinkedList is faster
        /*for(int i=0;i<10;i++){
            int j=9;
            j++;
            list.add(0,j);
        }*/
        //adding elements somewhere middle of the list---- LinkedList is faster
        for(int i=0;i<1E5;i++){
            int j=9;
            j++;
            list.add(2500,j);
        }
        long stop=System.currentTimeMillis();
        System.out.println("Time taken = "+(stop-start)+"ms for"+type);
    }
}
