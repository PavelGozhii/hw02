package com.company;

// It is task1
//Создаем новые напитки через билдер

public class Drink{
    private String name;
    private String description;
    private double price;

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    private Drink(Builder builder){
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
    }

    static class Builder{
        private String name;
        private String description;
        private double price;

        public Builder(String name, String description){
            this.name = name;
            this.description = description;
        }

        public Builder setPrice(double price){
            this.price = price;
            return this;
        }

        public Drink build(){
            return new Drink(this);
        }
    }
}