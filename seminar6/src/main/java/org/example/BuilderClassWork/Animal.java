package org.example.BuilderClassWork;

public abstract class Animal {
    private String name;
    private int weight;
    private String owner;
    private int age;
    private String favMeal;
    private boolean hungry;
    private byte cageNumber;
    private boolean fluffy;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavMeal(String favMeal) {
        this.favMeal = favMeal;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setCageNumber(byte cageNumber) {
        this.cageNumber = cageNumber;
    }

    public void setFluffy(boolean fluffy) {
        this.fluffy = fluffy;
    }

    @Override
    public String toString() {
        String line = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";
        String line5 = "";
        String line6 = "";
        String line7 = "";
        String line8 = "";
        if (hungry) line = " я голодный ";
        if (fluffy) line2 = " я пушистый ";
        if (name != null) line3 = " меня зовут " + name;
        if (owner != null) line4 = " мой хозяин " + owner;
        if (favMeal != null) line5 = " я люблю " + favMeal;
        if (age != 0) line6 = " мой возраст " + age;
        if (weight != 0) line6 = " мой вес  " + weight;
        if (cageNumber != 0) line7 = " сейчас я в клетке номер " + cageNumber;
        return line + line2 + line3 + line4 + line5 + line6 + line7 + line8;
    }}
