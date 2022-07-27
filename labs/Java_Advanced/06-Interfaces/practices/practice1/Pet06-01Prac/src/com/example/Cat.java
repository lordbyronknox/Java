
package com.example;

public class Cat extends Animal implements Pet{
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }
    
    public Cat() {
        this("Fluffy");
    }
    
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }
    
//    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
