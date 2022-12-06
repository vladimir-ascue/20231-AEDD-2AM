public class Principal {
    // Notación de variables y métodos
    // CAMEL CASE : Se utiliza una mayúscula al inicio de cada palabra
    //      NombresCompletos 
    //      DireccionLegal
    public static void main(String[] args) throws Exception {
        // TIPOS DE DATOS PRINCIPALES
        // En la declaracion de variables es necesario indicar el tipo de dato
        // Es posible hacer la declaraicon solamenta
        String nombre;
        // Y posteriormente hacer la asignación del valor de dicha variable
        nombre = "Vladimir"; // Cadena de caracteres >> texto

        // También es posible hacer la declaracion y la asignacion en una misma línea
        int edad = 40; // Numero entero
        double estatura = 1.73; // Real >> Decimal
        Boolean esSoltero = false;  // Booleano >> Solo toma 1 de 2 posibles valores (Verdadero o Falso)

        // para imprimir valores en pantalla es necesario usar la instruccion
        //   - System.out.print Si se desea imprimir en pantalla y dejar el cursos a continuacion del texto impreso
        //   - System.out.println Si se desea imprimir en pantalla y pasar el cursos a la linea siguiente
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("estatura: " + estatura);
        System.out.println("Es soltero: " + esSoltero);
    }
}
