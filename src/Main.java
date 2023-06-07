import abstraccion.Animal;
import abstraccion.animales.Cat;
import abstraccion.animales.Cow;
import abstraccion.animales.Dog;

public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog("canelo");

        System.out.println("-------------DOG-------------");
        System.out.println("El perro llamado: " + dog.getNombre());
        dog.Eath();
        dog.Sleep();
        dog.makeSound();

        System.out.println("-------------CAT-------------");
        Cat cat = new Cat();
        cat.Eath();
        cat.Sleep();
        cat.makeSound();

        System.out.println("-------------COW-------------");
        Cow cow = new Cow();
        cow.Eath();
        cow.Sleep();
        cow.makeSound();



    }
}