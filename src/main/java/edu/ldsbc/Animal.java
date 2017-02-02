package edu.ldsbc;

/**
 * Created by XPS on 2/1/2017.
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {
        System.out.println("Animal class is created");
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal class is created");
    }

    public void eat(){
        System.out.println("Animal eating");
    }

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
}
