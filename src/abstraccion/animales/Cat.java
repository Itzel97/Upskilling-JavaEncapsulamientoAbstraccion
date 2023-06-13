package abstraccion.animales;

import abstraccion.Animal;

public class Cat extends Animal {


    @Override
    public void Eath() {
        System.out.println("Fish");
    }

    @Override
    public void Sleep() {
        System.out.println("all night");

    }

    @Override
    public void makeSound() {
        System.out.println("Meowww");
    }

    @Override
    public String hunt() {
        return "mouse";
    }
}
