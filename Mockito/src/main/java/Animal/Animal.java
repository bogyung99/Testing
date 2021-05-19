package Animal;

import java.util.List;

public class Animal {
    String name;

    private int age;
    private Boolean isFly;
    List<String> animalList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getFly() {
        return isFly;
    }

    public void setFly(Boolean fly) {
        isFly = fly;
    }

    public List getAnimalList(){
        return animalList;
    }
}

