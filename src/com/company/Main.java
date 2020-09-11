package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Creature fish = new Creature("goldfish","river");
        Creature Bear = new Creature("Brown Bear","Forest");
         String[] river = {fish.name,"Otter",Bear.name};

        System.out.println(river[0] + river[2]);
    }
}
