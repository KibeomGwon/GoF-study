package main;

import flyweight.FlyWeight;
import flyweight.FlyWeightFactory;

public class Application {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight flyweight = factory.getFlyweight("A");

        System.out.println(flyweight);

        FlyWeight flyweight2 = factory.getFlyweight("A");

        System.out.println(flyweight2);

    }
}
