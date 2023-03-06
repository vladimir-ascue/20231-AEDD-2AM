import java.util.*;

public class Main {
    public static List<int> lista = new ArrayList<int>();
    public static Stack<int> pila = new Stack<int>();
    public static Queue<int> cola = new ArrayDeque<int>();

    /***
     * Este metodo separa el arreglo de numeros en una
     * pila que contiene los numero paraes y en una
     * cola que contiene los numero impares
     */
    public static void separar(){
       // Escribir el codigo necesario para hacer la separacion
        for (int a = 0; i < lista.size() - 1; i++) {
            if (/* completar */)
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
        /* Completar */
    }
    /***
     * Este metodo muestra los elementos de una cola
     * los elementos deben mostrarse en el orden que fueron ingresado
     * y considerando las caractristicas de una Pila (FILO - First In Last Out)
     */
    public static void mostrarCola(){
        /* Completar */
    }

    public static void main(String[] args) {
        int [] numeros = {13,24,45,67,34,32,90,17};
        separar();
        mostrarCola();
        mostrarPila();
    }

}
