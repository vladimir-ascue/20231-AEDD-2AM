
public class PrincipalEstructura {
    // Variables, funciones y métodos globales
    // Se pueden usar en t odo el programa
    public static String nombre = "vladimir"; // public: visible desde la misma clase y cualquier otra clase
    protected static int edad = 40; // protected: visible desde la misma clase y las clases que heredan de ella
    private static Boolean usaLentes = true; // private: visible unicamente desde la misma clase

    // main(): Método principal en caso de ser una clase ejecutable
    public static void main(String[] args) {

        // instrucciones del método principal
        System.out.println("Hola Java ...");
        System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Usa lentes: " + usaLentes);

    } // fin del método principal (main)
} // fin de la clase
