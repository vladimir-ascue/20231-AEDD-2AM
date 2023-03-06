import java.util.*;

public class Main {
    public static List<Integer> lista = new ArrayList<Integer>();
    public static Stack<Integer> pila = new Stack<Integer>();
    public static Queue<Integer> cola = new ArrayDeque<Integer>();

    /***
     * Este metodo separa el arreglo de numeros en una
     * pila que contiene los numero paraes y en una
     * cola que contiene los numero impares
     */
    public static void separar(){
       // Escribir el codigo necesario para hacer la separacion
        for (int a = 0; a < lista.size() - 1; a++) {
            if (/* completar */);
                /* completar */

            else
                /* completar */

        }
    }

    /***
     * Este metodo muestra los elementos de una pila
     * los elementos deben mostrarse en el orden que fueron ingresado
     * y considerando las caractristicas de una Pila (FILO - First In Last Out)
     */
    public static void mostrarPila(){
        /* Completar código */
    }
    /***
     * Este metodo muestra los elementos de una cola
     * los elementos deben mostrarse en el orden que fueron ingresado
     * y considerando las caractristicas de una Pila (FILO - First In Last Out)
     */
    public static void mostrarCola(){
        /* Completar código */

    }

    public static void main(String[] args) {
        lista.add(12);
        pila.add(35);
        cola.add(876);
        int [] numeros = {13,24,45,67,34,32,90,17};
        separar();
        mostrarCola();
        mostrarPila();
    }
}
