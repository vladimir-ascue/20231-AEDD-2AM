public class PrincipalCalculadora {
    /* Ejemplo */
    public static void menu(){
        LectorV2.escribirLinea("########## MENU PRINCIPAL ##########");
        LectorV2.escribirLinea("0- Salir.");
        LectorV2.escribirLinea("1- Suma.");
        LectorV2.escribirLinea("2- Resta.");
        LectorV2.escribirLinea("3- Multiplicación");
        LectorV2.escribirLinea("4- División");
    }

    /* Funciones */
    public static int suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    public static int resta(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicacion(int num1, int num2){
        int producto = num1 * num2;
        return producto;
    }

    public static double division(int num1, int num2){
        double cosiente = 0; // Declaracion
        cosiente = num1 / num2;
        return cosiente;
    }
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = LectorV2.leerEntero(" >> Ingrese una opción : ");
            int num1; // Definición ~ Declaración
            int num2; // Definición ~ Declaración
            switch( opcion ){
                case 0:
                    LectorV2.escribirLinea("\tGracias, vuelva pronto.");
                    break;
                case 1:
                    LectorV2.escribirLinea("\tVamos a sumar");
                    num1 = LectorV2.leerEntero("Ingrese primer sumando: ");
                    num2 = LectorV2.leerEntero("Ingrese segundo sumando: ");
                    int suma = suma(num1, num2);
                    LectorV2.escribirLinea("La suma " + num1 +  " + " + num2 + " es: " + suma);
                    break;
                case 2:
                    LectorV2.escribirLinea("\tVamos a restar");
                    num1 = LectorV2.leerEntero("Ingrese Minuebdo: ");
                    num2 = LectorV2.leerEntero("Ingrese Sustraendo: ");
                    int resta = resta(num1, num2);
                    LectorV2.escribirLinea("La diferencia " + num1 +  " - " + num2 + " es: " + resta);
                    break;
                case 3:
                    LectorV2.escribirLinea("\tVamos a multiplicar");
                    num1 = LectorV2.leerEntero("Ingrese primer operando: ");
                    num2 = LectorV2.leerEntero("Ingrese segundo operando: ");
                    int producto = multiplicacion(num1, num2);
                    LectorV2.escribirLinea("El producto de " + num1 +  " * " + num2 + " es: " + producto);
                    break;
                case 4:
                    LectorV2.escribirLinea("\tVamos a dividir");
                    num1 = LectorV2.leerEntero("Ingrese Dividendo: ");
                    num2 = LectorV2.leerEntero("Ingrese Divisor: "); // 0

                    do {
                        if ( num2 == 0 ) {
                            num2 = LectorV2.leerEntero(" \t Ingrese un nueevo Divisor diferente de cero (0): ");
                        }
                    } while ( num2 == 0 );

                    double cosiente = division(num1, num2);
                    LectorV2.escribirLinea("El cosiente de " + num1 +  " / " + num2 + " es: " + cosiente);
                    break;
                default:
                    break;
            }
        } while ( opcion != 0 );
    }
}
