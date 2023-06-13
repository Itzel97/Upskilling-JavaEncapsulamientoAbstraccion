package abstraccion.animales;

import abstraccion.Animal;

public class Dog extends Animal {

    String nombre ;

    public Dog(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void Eath() {
        System.out.println("Meat");
    }

    @Override
    public void Sleep() {
        System.out.println("All day");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    @Override
    public String hunt() {
        return "squirel";
    }
}
