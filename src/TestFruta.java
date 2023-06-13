import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*
 * El Output de esta clase es ["Naranja", "Manzana", "Mango", "Cereza"]
 *
 * El atributo "frutas" de la clase Fruta es privado, pero en la linea 22 esta siendo modificado por una clase distinta
 * lo cual es un error en el encapsulamiento, pues los atributos privados solo deben ser accedidos a traves
 * de metodos publicos (como getters y setter).
 *
 * OBJETIVO: Modificando SOLAMENTE LA LINEA 33, soluciona el error de encapsulamiento, de modo que no se pueda modificar la lista
 * fuera de la clase Fruta.
 *
 * Cuando este RESUELTO, el output será ["Naranja", "Manzana", "Mango"]
 *
 */
public class TestFruta {

    public static void main(String[] args) {
        Fruta fruta = new Fruta();
      //  fruta.getFrutas().add("Cereza"); // La lista frutas es privada, y esta siendo modificada desde otra clase.
        System.out.println(fruta.getFrutas());
    }
}

class Fruta{

    private List<String> frutas = new ArrayList<>(Arrays.asList("Naranja", "Manzana", "Mango"));
    // Como tal el error es que el como tal no estamos llamando la propiedad frutas con una posicion en especifica, estamis usando el getFrutas para consultar el dato,
    // pero como tal un get no es un sett, por lo que no deberia poder ser modificado el array.


    public List<String> getFrutas() {
        /* Reemplazar solo la siguiente linea -
        * stream().toList() - Accumulates the elements of this stream into a list.
        * The elements in this streams encounter order, if one exists.
        * The retuned list in unmodificable.
        * */
       return  frutas.stream().toList();
    }
}