public class PrincipalCalculadora {
    /* EJmplo */
    public static void menu(){
        LectorV2.escribirLinea("########## MENU PRINCIPAL ##########");
        LectorV2.escribirLinea("0- Salir.");
        LectorV2.escribirLinea("0- Suma.");
        LectorV2.escribirLinea("0- Resta.");
        LectorV2.escribirLinea("0-  .....");
        LectorV2.escribirLinea("0-  .....");
    }

    /* Funciones */
    public static int suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    public static void main(String[] args) {
        menu();
        int opcion = LectorV2.leerEntero(" >> Ingrese una opción : ");
        // Usamos la estructura SWITCH con la variable opcion para escojer la operacion
        // Usamos un bucle DO-WHILE para el bucle principal
        //
    }
}
