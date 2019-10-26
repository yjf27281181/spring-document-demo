package edu.csu.example.demo.test;

public class ThingOne {
    public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
        System.out.println(thingTwo.getInfo());
        System.out.println(thingThree.getInfo());
    }
}
