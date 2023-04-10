package org.example.BuilderClassWork;

public class Main {
    public static void main(String[] args) {
//
//        Cat cat = CatBuilder.getInstance().owner("Петя").weight(12).setName("пушок").hungry(true).build();
//        System.out.println(cat.toString());
//        Cat cat2 = CatBuilder.getInstance().setName("Kitty").weight(23).age(2).cageNumber((byte)41).build();
//        System.out.println(cat2.toString());

        Cat cat3 = AnimalBuilder.getInstanceCat().setName("markiz").fluffy(true).build();
        System.out.println(cat3.toString());
        Dog dog1 = AnimalBuilder.getInstanceDog().setName("sharik").favMeal("косточку").build();
        System.out.println(dog1.toString());
    }
}