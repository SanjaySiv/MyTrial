package com.example.helloworld;

import java.util.PriorityQueue;

public class QueuePriorityQueue {
    public static void main(String [] args){
        PriorityQueue<Employee>pq=new PriorityQueue<>();
        pq.add(new Employee(1, "Vijay", 20));
        pq.add(new Employee(2, "Ajay", 25));
        pq.add(new Employee(3, "Ravi", 18));
        pq.add(new Employee(4, "Zain", 29));
        pq.add(new Employee(5, "Babu", 14));
        System.out.println("Elements of priority queue");
        for(Employee e:pq){
            System.out.println(e);
        }
        System.out.println("element()"+pq.element());//retrieves head
        System.out.println("poll()"+pq.poll());//removes and retrieves head of queue
        System.out.println("peek()"+pq.peek());//retrieves head
        pq.remove();//removes head
        System.out.println("Elements of priority queue after removing");
        for(Employee e:pq){
            System.out.println(e);
        }
    }
}
