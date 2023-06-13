package abstraccion.animales;

import abstraccion.Animal;

public class Cow extends Animal {
    @Override
    public void Eath() {
        System.out.println("Grass");
    }

    @Override
    public void Sleep() {
        System.out.println("16 hours peer day");
    }

    @Override
    public void makeSound() {
        System.out.println("Moooooo");
    }

    @Override
    public String hunt() {
        return null;
    }
}
