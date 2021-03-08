package com.example.helloworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        return Integer.compare(l1,l2);
    }
}
class ReverseLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        return Integer.compare(-l1,-l2);
    }
}
class ReverseAlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}
public class SortingListUsingComparator2 {
    public static void main(String[] args){
        List<String>animals=new ArrayList<>();
        animals.add("Kangaroo");
        animals.add("Elephant");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Tiger");
        System.out.println("Sorting list by length of elements ascending");
        animals.sort(new LengthComparator());
        for(String s:animals){
            System.out.println(s);
        }
        System.out.println("Sorting list by length of elements descending");
        animals.sort(new ReverseLengthComparator());
        for(String s:animals){
            System.out.println(s);
        }
        System.out.println("Sorting list by reverse alphabetical order of elements");
        animals.sort(new ReverseAlphabeticalComparator());
        for(String s:animals){
            System.out.println(s);
        }
    }
}
