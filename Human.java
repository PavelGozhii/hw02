package com.company;


// Task : Static Nested, Local and inner Classes (Task2)

public class Human {
    private String name;
    private int age;
    private Pet pet;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return this.pet;
    }

    class Pet {
        private String name;
        private int age;

        Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setName() {
            this.name = name;
        }

    }

    public static class Planet {
        String name;


        Planet(String name, String description, int age) {
            this.name = name;
            System.out.println("Planet for people already exist");
            class Description {
                int age;
                String description;

                Description(int age, String description) {
                    this.age = age;
                    this.description = description;
                }

                public int getAge() {
                    return age;
                }

                public String getDescription() {
                    return description;

                }
            }
            System.out.println(new Description(age, description) {
                @Override
                public int getAge() {
                    return super.getAge() + 5;
                }

            }.getAge());
        }

        public String getName() {
            return name;
        }

        public void setName() {
            this.name = name;
        }

        public void setPet() {
        }

    }
}
