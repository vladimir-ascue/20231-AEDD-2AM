public class PrincipalWhile {
    public static void main(String[] args) {

        int limite = 25;
        // Variable de iteración (iterador) >> Controla el flujo del bucle
        int iterador = 6;

        Boolean continuo = (iterador <= 10 ) && ( iterador > 4 );

        while( continuo ){
            // instrucciones que se ejecutan si se cumple la condicion
            // la variaciondel iterador debe hacerde dentro del bucle y se pueden usar los
            // operadores ++, --, +=, -=. *= u otras formas de variacion requeridas

            LectorV2.escribirLinea("\t"+iterador +" * "+ limite + " = "+ iterador * limite);
            iterador++;
        }

        LectorV2.escribirLinea(" Segundo bucle: ");

        Boolean flag = false;

        while ( flag ){

            LectorV2.escribirLinea("Instruccion dentro del bucle WHILE");

        }

        do {

            LectorV2.escribirLinea("Instruccion dentro del bucle DO-WHILE");

        } while( flag );

    }
}
