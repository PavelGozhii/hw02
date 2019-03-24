package com.company;


import com.company.Task6.Builder;
import com.company.Task6.Group;
import com.company.Task6.Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Строитель кофе(Цена разная, название и описание одинаково)
        Drink.Builder CoffeeBuilder = new Drink.Builder("Кофе",
                "Просто вода, кофе, сахар и немного магии");

        Drink coffee = CoffeeBuilder.setPrice(21).build();
        System.out.println(coffee.getName()+ "\n" +
                            coffee.getDescription()+ "\n" +
                            coffee.getPrice());

        // Создаем человека, даем ему планету Земля которая единна для всех людей и собаку, собственую
        Human human = new Human("Герман", 25);
        Human.Planet planet = new Human.Planet("Earth", "Наша планета", 500000);
        Human.Pet dog = human.new Pet("Dog", 24);

        // Сортуруем масив
        int[] arr = new int[]{2, 3, 4, 6, 1, 8, 10};
        System.out.println("Unsorted: " + arr.toString());
        arr = Sort.selectionSort(arr);
        System.out.println("Sorted" + arr.toString());

        Animal cat = new Animal("Cat", 24, 20);
        //Я не могу никак его изменить, ну по крайней мере, знакомыми мне способами


        // Создание нових фигур идет через класс билдер
        // новие фигуры создаются через общий интерфейс, не зря же мы его создавали
        Builder builder = new Builder();
        Shape circle = builder.buildCircle(10);
        Shape triangle = builder.builTriangle(new int[]{1, 2, 2});
        Shape square = builder.buildSquare(5);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);
        circle.writeObject();
        // Групируем фигуры, получаем групу
        Group group = new Group(shapes);
        group.printView();
    }
}
