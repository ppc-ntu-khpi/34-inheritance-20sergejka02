package test;

import domain.Dog;

public class TestAnimal
{
    public static void main(String[] args)
    {
        Dog dog=new Dog("Borbos");
        System.out.println(dog);
        dog.hunt();
        dog.eat();
        dog.speak();
        dog.play();
    }
}
