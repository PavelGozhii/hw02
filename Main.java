package com.company;


import com.company.Task6.Builder;
import com.company.Task6.Group;
import com.company.Task6.Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InvalidInputException {

        //Coffee Builder
        DrinkBuilder CoffeeBuilder = new DrinkBuilder();

        Drink coffee = CoffeeBuilder.setPrice(21).setName("Coffee").setDescription("It is coffee").build();
        System.out.println(coffee.toString());

        // Create human
        Human human = new Human("Герман", 25);
        Human.Planet planet = new Human.Planet("Earth", "Наша планета", 500000);
        Human.Pet dog = human.new Pet("Dog", 24);

        // Array Sort
        int[] arr = new int[]{2, 3, 4, 6, 1, 8, 10};
        System.out.println("Unsorted: " + arr.toString());
        arr = Sort.selectionSort(arr);
        System.out.println("Sorted" + arr.toString());

        Animal cat = new Animal("Cat", 24, 20);
        //Immutable class


        // Creating new Shape
        Builder builder = new Builder();
        Shape circle = builder.buildCircle(10);
        Shape triangle = builder.buildTriangle(new int[]{1, 2, 2});
        Shape square = builder.buildSquare(5);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);
        circle.writeObject();
        // Group shape, get group
        Group group = new Group(shapes);
        group.printView();
    }
}
