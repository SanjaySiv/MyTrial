package com.example.helloworld;

public class PolymorphismExample {
    public static void main(String[] args){
        Plant plant1=new Plant();
        Tree tree=new Tree();
        Plant plant2=new Tree();//Plant reference, obj type Tree(Upcasting)
        plant1.grow();
        tree.grow();//overriding Plant class method
        plant2.grow();
        tree.shedLeaves();
        //plant1.shedLeaves(); Plant object can't access to Tree class method
        //plant2.shedLeaves(); Even though plant2 object type is Tree it's reference is Plant type so can't access
        doGrow(tree);//Plant class obj is expected but we can pass it's subclass obj too here
    }
    public static void doGrow(Plant plant){
        plant.grow();
    }
}
