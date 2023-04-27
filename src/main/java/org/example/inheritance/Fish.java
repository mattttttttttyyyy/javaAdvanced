package org.example.inheritance;

import java.util.Arrays;

public class Fish extends Animal {

    private String name;
    private int age;
    private String type;

    public Fish(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Fish() {
        name = "Fishy";
        age = 5;
        type = "bass";
    }


    public void makeSound() {
        bubbles();
    }
    public void bubbles() {
        System.out.println(name + ": bubble bubble");
    }
    public void move(){
        System.out.println(name + " is swimming");
        makeSound();
        System.out.println("---------------------");
    }

    public void doSomeSwimming() {
        move();
        move();
        move();
        move();
    }

    public void eatSomething() {
        super.eatSomething();
        System.out.println("Fish is eating fish stuff.");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
