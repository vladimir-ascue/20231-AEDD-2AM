import java.util.Scanner;

public class LectorV3 {
    @SuppressWarnings("resource")
    protected static int LeerEntero(String mensaje) {
        Boolean flagEntero = true;
        int entero = 0;
        do {
            try {
                Scanner lector = new Scanner(System.in);
                System.out.println(mensaje);
                entero = lector.nextInt();
                flagEntero = false;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar valor entero: ");
                flagEntero = true;
                System.out.print("Intentelo nuevamente: ");
            }
        } while (flagEntero);
        return entero;
    }

    @SuppressWarnings("resource")
    protected static double LeerReal(String mensaje) {
        Boolean flagReal = true;
        double real = 0;
        do {
            try {
                Scanner lector = new Scanner(System.in);
                System.out.print(mensaje);
                real = lector.nextDouble();
                flagReal = false;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un valor real: ");
                flagReal = true;
                System.out.print("Intentelo nuevamente: ");
            }
        } while (flagReal);
        return real;
    }

    @SuppressWarnings("resource")
    protected static String LeerTexto(String mensaje) {
        Scanner lector = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = lector.nextLine();
        return texto;
    }

    protected static void escribir(String texto) {
        System.out.print(texto);
    }

    protected static void escribirLinea(String texto) {
        System.out.println(texto);
    }
}