package com.example.helloworld;

import world.Plant;

public class AccessModifierDemo extends Plant{
    public static void main(String[] args){
        Plant plant=new Plant();
        System.out.println(plant.name);
        System.out.println(Plant.id);
        //System.out.println(plant.type);

        //System.out.println(plant.height);
    }
}
