package com.company;

// It is task1

public class Drink {
    private String name;
    private String description;
    private double price;
    DrinkBuilder drinkBuilder;

    public DrinkBuilder getDrinkBuilder(){
        return this.drinkBuilder;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    private Drink(String name, String description, double price, DrinkBuilder drinkBuilder) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.drinkBuilder = drinkBuilder;
    }

     static class DrinkBuilder {
        private String name = "";
        private String description = "";
        private double price = 0;



        public DrinkBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DrinkBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public DrinkBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Drink build() {
            return new Drink(name, description, price, this);
        }

    }

    @Override
    public String toString() {
        return name + "\n" + description + "\n" + price;
    }
}
