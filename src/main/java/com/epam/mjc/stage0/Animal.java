package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
        }
    public String getDescription() {
        String paw = "paw";
        String ano = "a";
        if (numberOfPaws != 1) {
            paw = "paws";
        }
        if (!hasFur) {
            ano = "no";
        }
        String description = "This animal is mostly "+color+". It has "+numberOfPaws+" "+paw+" and "+ano+" fur.";
        return description;
}

/*    public static void main(String[] args) {
        Animal animal = new Animal("red", 3,true);
        System.out.println(animal.getDescription());*/
//    }
}
