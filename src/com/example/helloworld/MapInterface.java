package com.example.helloworld;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args){
        Map<Integer,String>m=new HashMap<>();
        m.put(3,"Amit");
        m.put(4,"Rahul");
        m.put(1,"Vijay");
        m.put(6,"Ajit");
        //traversing map
        Set set=m.entrySet();//converting map to set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        for(Map.Entry  map:m.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
