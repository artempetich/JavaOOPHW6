package org.example.BuilderClassWork;

public class AnimalBuilder {
    private static AnimalBuilder instance = null;
    CatBuilder obj;
    DogBuilder objD;

    private AnimalBuilder() {

    }

    public static CatBuilder getInstanceCat() {
        return new CatBuilder().getInstance();
    }
    public static DogBuilder getInstanceDog() {
        return new DogBuilder().getInstance();
    }


}
