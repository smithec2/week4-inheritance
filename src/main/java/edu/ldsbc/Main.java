package edu.ldsbc;

/**
 * Created by XPS on 2/1/2017.
 */
public class Main {
    public static void main(String args[])
    {
        //Animal (super class)
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
        System.out.println( cat.sleep());

        Animal dog2 = new Dog();

        dog2.setName("toad");
        System.out.println(dog2.getName());
        dog2.eat();
        dog.eatBall();
        Dog dog3 = (Dog)dog2;
        dog3.eatBall();
        //dog2.eatBall();

        // dog cat (subclass)
        //override
        //eat
        // cast
        System.out.println();
        //
    }
}
