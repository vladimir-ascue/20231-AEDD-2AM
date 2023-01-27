import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[5];
        System.out.println("Elemento 3: " + num[2]);

        String[] cad = new String[5];
        System.out.println("Elemento 3: " + cad[2]);

        // if ( cad[2].compareTo("") == 0) Si copmareTo devuelve Cero son iguales
        // if ( cad[2].equals("") ) Si equals devuelve true son iguales
        if ( cad[2] == null)
            System.out.println("Es cadena nula");
        else
            System.out.println("No es cadena vacia");

        num[0] = 43;  // Asignacion
        num[1] = 24;  // Asignacion
        num[2] = 0;  // Asignacion
        num[3] = 654;  // Asignacion
        num[4] = -542;  // Asignacion

        cad[0] = "Francisco";
        cad[1] = "Javier";
        cad[2] = "Juan";
        cad[3] = "Pedro";
        cad[4] = "Chino";

//        String nombre = new Scanner(System.in).nextLine();
//        int edad = new Scanner(System.in).nextInt(); // mextDouble() para decimal
//
//        System.out.println(nombre + " tiene " + edad + " años.");

//        for (int i = 0; i < cad.length; i++) {
//            // Leer nombres
//            System.out.print("Nuevo nombre " + (i + 1) + ":");
//            cad[i] = new Scanner(System.in).nextLine();
//
//            // Leer edades
//            System.out.print("Nueva edad " + (i + 1) + ":");
//            num[i] = new Scanner(System.in).nextInt();
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.print("Nombre " + (i + 1) + ":");
//            System.out.println(cad[i]);
//
//            System.out.print("Edad " + (i + 1) + ":");
//            System.out.println(num[i]);
//        }

        for (int i = 10; i > 10; i-=2) {
            System.out.println(i);
        }

    }
}
