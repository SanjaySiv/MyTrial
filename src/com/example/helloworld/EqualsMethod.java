package com.example.helloworld;

import java.util.Objects;

class PersonDetails{
    private int id;
    private String name;
    public PersonDetails(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDetails that = (PersonDetails) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "PersonDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class EqualsMethod {
    public static void main(String[] args){
        PersonDetails p1=new PersonDetails(12,"Bob");
        PersonDetails p2=new PersonDetails(12,"Bob");
        System.out.println("Comparing with \"==\" "+(p1==p2));
        System.out.println("Comparing with equals() "+p1.equals(p2));
        Double d1=7.25;
        Double d2=7.25;
        System.out.println(d1==d2);
        Integer i1=7;
        Integer i2=7;
        System.out.println(i1==i2);
    }
}
