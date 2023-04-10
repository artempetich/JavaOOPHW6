package org.example.BuilderClassWork;

public class DogBuilder {
    private static DogBuilder instance = null;
    Dog objD;

    public DogBuilder() {

    }

    public static DogBuilder getInstance() {
        if (instance == null) instance = new DogBuilder();
        instance.objD = new Dog();

        return instance;
    }

    public DogBuilder setName(String name) {
        objD.setName(name);
        return this;
    }

    public DogBuilder weight(int weight) {
        objD.setWeight(weight);
        return this;
    }
    public DogBuilder owner(String owner){
        objD.setOwner(owner);
        return this;
    }
    public DogBuilder fluffy(boolean fluffy){
        objD.setFluffy(fluffy);
        return this;
    }
    public DogBuilder cageNumber(byte cage){
        objD.setCageNumber(cage);
        return this;
    }

    public DogBuilder hungry(boolean hungry){
        objD.setHungry(hungry);
        return this;
    }
    public DogBuilder favMeal(String meal){
        objD.setFavMeal(meal);
        return this;
    }
    public DogBuilder age(int age){
        objD.setAge(age);
        return this;
    }
    public Dog build(){
        return objD;
    }

}
