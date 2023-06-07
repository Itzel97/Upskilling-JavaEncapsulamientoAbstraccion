# Upskilling-Java Encapsulation and Abstraction.

## Encapsulation
Encapsulation is binding the data members with member variables. This will avoid the direct access of variables, because direct access of variables may violate privacy, and hiding of the implementation will not be possible.
Encapsulation minimizes your code’s part revealed to the user. The user can be anyone who uses your published code or perhaps your code’s remaining part.

Encapsulation works like a protective wrapper that conceals the code and data within the class. That data and code will be accessed outside the method/member function and the class that is not the members of that class.


| Modifier | Class | Package | Subclass | global |
| ------------- | ------------- |------------- |------------- |------------- |
| public | :white_check_mark: | :white_check_mark: | :white_check_mark: |:white_check_mark: | :white_check_mark: |
| protected | :white_check_mark: | :white_check_mark: | :white_check_mark: | :x: |
| (default) | :white_check_mark: | :white_check_mark: | :x: | :x: |
| private | :white_check_mark: | :x: | :x: | :x: |


| Java | private | (default)  | protected | public |
| ------------- | ------------- |------------- |------------- |------------- |
| class | :x: | :white_check_mark: | :x: |:white_check_mark: | :white_check_mark: |
| variable | :white_check_mark: | :white_check_mark: | :white_check_mark: | :white_check_mark: |
| function | :white_check_mark: | :white_check_mark: | :white_check_mark: | :white_check_mark: |
| constructor | :white_check_mark: | :white_check_mark: | :white_check_mark:| :white_check_mark:|
| interface | :x: | :white_check_mark:  | :x: | :white_check_mark: | 


## Abstraction
Abstraction is a process of hiding unnecessary data and showing only relevant data. Out of an ocean of data, we are only maintaining the transparency of some data to the user. This important concept in object-oriented programming will reduce the complexity of the code and increases the readability.

### Abstract class
In Java, an abstract class cannot be instantiated by itself, because another class is expected to extend it. it provides a common base in all its subclasses, but allows them to have their own implementation.

### Abstract method
It is declared but not defined in a class. It works as a placeholder for methods that must be implemented by a subclass. Implementing an abstract method is mandatory for classes that extend the abstract class.

#### Example:

Abstract class:

```
package abstraccion;

public abstract class  Animal {

    public abstract void  Eath() ;
    public  abstract void Sleep() ;
    public abstract void makeSound() ;


}

```

Subclass Cat that extends Animal:

```
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
}

```

### Interface
The interfaces are purely abstract, this means that the classes that implements one interface are forced to make the implementation of all is methods.
All the methood of an interface are public classes by default, thats the reason that it doesn't need to be specified.
As of Java 8, the interfaces allow the default methods, which are methods that if they have an implementation give the interface



