package com.annasladkykh;

/*
1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать массив из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
 */

import java.util.Random;

public class Homework11 {

    public static void main(String[] args) {
        Person[] person = new Person[100];
        createRandomArrayOfPeople(person);
    }

    private static void createRandomArrayOfPeople(Person[] groupOfPeople) {
        for (int i = 0; i < groupOfPeople.length; i++) {
            groupOfPeople[i] = new Person(getName(), getSurname(), getAge(), getWeight(), getHeight());
            System.out.println(groupOfPeople[i]);
        }
    }

    private static String getName() {
        Random random = new Random();
        String[] gifferentNames = {"Martin", "Jenifer", "Robert", "Lindsey", "Noa", "Carl", "Denis", "Megan", "Taylor", "Alice"};
        int randomName = random.nextInt(10);
        return gifferentNames[randomName];
    }

    private static String getSurname() {
        Random random = new Random();
        String[] differentSurnames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Jackson"};
        int randomSurname = random.nextInt(10);
        return differentSurnames[randomSurname];
    }

    private static int getAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private static int getWeight() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private static int getHeight() {
        Random random = new Random();
        return random.nextInt(100);
    }

}