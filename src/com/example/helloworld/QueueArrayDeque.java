package com.example.helloworld;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueArrayDeque {
    public static void main(String [] args){
        Deque<Employee> adq=new ArrayDeque<>();
        adq.add(new Employee(1, "Vijay", 20));
        adq.add(new Employee(2, "Ajay", 25));
        adq.add(new Employee(3, "Ravi", 18));
        adq.add(new Employee(4, "Zain", 29));
        adq.add(new Employee(5, "Babu", 14));
        System.out.println("Elements of priority queue");
        for(Employee e:adq){
            System.out.println(e);
        }
        System.out.println("element()"+adq.element());//retrieves head
        System.out.println("poll()"+adq.poll());//removes and retrieves head of queue
        System.out.println("peek()"+adq.peek());//retrieves head
        adq.remove();//removes head
        System.out.println("Elements of ArrayDeque queue after removing");
        for(Employee e:adq){
            System.out.println(e);
        }
        adq.offerFirst(new Employee(10, "Sabu", 30));//offerLast() is also there
        System.out.println("Elements of ArrayDeque queue after offerFirst()");
        for(Employee e:adq){
            System.out.println(e);
        }
        adq.pollLast();//pollLast() is also there
        System.out.println("Elements of ArrayDeque queue after pollLast()");
        for(Employee e:adq){
            System.out.println(e);
        }
    }
}
