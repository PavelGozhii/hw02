package com.company;


import jdk.nashorn.internal.ir.annotations.Immutable;

// Task 4 immutable class
@Immutable
final public class Animal {
    private final String name;
    private final int age;
    private final double height;

    public Animal(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public Animal setHeight(double height) {
        return new Animal(this.name, this.age, height);
    }
}
