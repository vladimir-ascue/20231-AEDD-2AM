public class PrincipalDoWhile {
    public static void main(String[] args) {
        Boolean flag = true;
        int iterador = 0;
        int limite = 7;
        // El flujo del bucle se controla con una condicion de coninuidad pero tambien se puede
        // usar directamente una variable de tipo Boolean
        LectorV2.escribirLinea(" <*****> Ejecución del bucle while <*****> ");
        do{
            iterador ++;
            LectorV2.escribirLinea("\titerador = " + iterador);
            if ( iterador == limite ){
                flag = false;
            }
        }while ( flag );
    }
}
