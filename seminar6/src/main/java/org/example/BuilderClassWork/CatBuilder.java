package org.example.BuilderClassWork;

public class CatBuilder {
    private static CatBuilder instance = null;
    Cat obj;

    public CatBuilder() {

    }

    public static CatBuilder getInstance() {
        if (instance == null) instance = new CatBuilder();
        instance.obj = new Cat();

        return instance;
    }

    public CatBuilder setName(String name) {
        obj.setName(name);
        return this;
    }

    public CatBuilder weight(int weight) {
        obj.setWeight(weight);
        return this;
    }
    public CatBuilder owner(String owner){
        obj.setOwner(owner);
        return this;
    }
    public CatBuilder fluffy(boolean fluffy){
        obj.setFluffy(fluffy);
        return this;
    }
    public CatBuilder cageNumber(byte cage){
        obj.setCageNumber(cage);
        return this;
    }

    public CatBuilder hungry(boolean hungry){
        obj.setHungry(hungry);
        return this;
    }
    public CatBuilder favMeal(String meal){
        obj.setFavMeal(meal);
        return this;
    }
    public CatBuilder age(int age){
        obj.setAge(age);
        return this;
    }
    public Cat build(){
        return obj;
    }

}