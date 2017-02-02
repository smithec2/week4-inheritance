package edu.ldsbc;

/**
 * Created by XPS on 2/1/2017.
 */
public class Dog extends Animal {

    public Dog(){
        super();
        System.out.println("I have a dog");

    }

    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }

    public void eatBall()
    {
        System.out.println("eat ball");
    }
}
