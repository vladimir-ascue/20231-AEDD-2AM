public class calculadoraMain {
    /* Procedimiento: "void"
    * Ejecuta un conjunto de instrucciones sin
    * devolver un valor o resultado
    * */
    public static void menu(){
        LectorV2.escribirLinea("********* MENU PRINCIPAL *********");
        LectorV2.escribirLinea(" 0- Salir");
        LectorV2.escribirLinea(" 1- Suma");
        LectorV2.escribirLinea(" 2- Resta");
        LectorV2.escribirLinea(" 3- Multiplicación");
        LectorV2.escribirLinea(" 4- Division");
    }
    /* Funcion: "Tipo de dato que se debe retornar"
     * Ejecuta un conjunto de instrucciones y
     * devuelve un valor como resultado del tipo indicado
     * */
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String arg[]){
        menu();
        int opcion = LectorV2.LeerEntero("Ingrese una opción: ");
        switch (opcion){
            case 0:
                LectorV2.escribirLinea("Adios... Gracias por participar.");
                break;
            case 1:
                LectorV2.escribirLinea("Vamos a sumar 2 Numeros. \n Ingreselos ahora:");
                int num1 = LectorV2.LeerEntero("Ingrese numero 1: ");
                int num2 = LectorV2.LeerEntero("Ingrese numero 2: ");
                int suma = sumar(num1, num2);
                LectorV2.escribir("El resultado de la suma es: " + suma);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:

                break;
        }

        String ciudad = LectorV2.LeerTexto("Ingrese nombre de ciudad: ");
        switch (ciudad){
            case "Lima":
                LectorV2.escribirLinea("La ciudad es: " + ciudad);
                break;
            case "Cusco":
                LectorV2.escribirLinea("La ciudad es:  " + ciudad);
                break;
            case "Arequipa":
                LectorV2.escribirLinea("La ciudad es:  " + ciudad);
                break;
            default:
                LectorV2.escribirLinea("El nombre no esta registraado.");
                break;
        }
    }
}