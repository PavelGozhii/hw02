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


    //As I understand it, we need to change the class field without changing it,
    // that is, the usual setter does not fit,
    // it is logical to simply create a new object in this case.
    public Animal setHeight(double height){
        return new Animal(this.name, this.age, height);
    }
}
