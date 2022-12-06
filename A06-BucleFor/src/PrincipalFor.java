public class PrincipalFor {
    public static void main(String[] args) {
        // Si el ierador se declara dentro del bucle for, éste existirá únicamente dentro del bucle for
        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> iterador declarado en el bucle for : \n No se podrá usar fuera del bucle for");
        for (int iterador1 = 1 ; iterador1 < 10; iterador1++ ){
            // Instrucciones que se ejecutan mientras el iterador cumpla con la condición de límite
            System.out.println(" iterador1 = " + iterador1 );
        }
        // LectorV2.escribirLinea("iterador1 usado fuera del contexto del bucle for genera un error");
        // LectorV2.escribirLinea("iterador1 = " + iterador1);  // Descomentar esta generará un error "Cannot resolve symbol 'iterador1'"

        // Si el iterador se declara fuera del bucle for, éste existirá fuera del bucle for pero solo dentro del metoto main()
        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> iterador declarado fuera del bucle: \n se podrá usar fuera del bucle for");
        int iterador2;
        for (iterador2 = 1 ; iterador2 < 10; iterador2++ ){
            // Instrucciones que se ejecutan mientras el iterador cumpla con la condición de límite
            System.out.println(" iterador2 = " + iterador2 );
        }
        LectorV2.escribirLinea("iterador2 usado fuera del contexto del bucle for");
        LectorV2.escribirLinea("Dentro del bucle: iterador2 = " + iterador2);
        LectorV2.escribirLinea("Nótese quel último valor de iterador2 es 10 y este valor ya no se usa \n dentro del bucle pues ya no se cumple la condicion de límite");

        // La variable i tiene valor inicial de 1 pero la condición para que el bucle se ejecute o continue es que i
        // debe ser menor a 1, condición que no se cumple, por lo que NO SE ENTRA AL BUCLE.
        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> Condicion de limite con desigualdad: \n la condicion de limite nunca se cumple: resultado vacio");
        for (int i = 1 ; i < 1; i++ ){
            // la variable
            System.out.println(" i = " + i );
        }

        // La condición de limite debe ser una desigualdad<; <=; >; >=
        // Si se usa una igualdad ( == ) solamente funcionara una vez siempre y cuando el valor de limite sea igual
        // al valor de inicialización
        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> Condicion de limite con igualdad: \n valor inical del iterador y valor de limite son diferentes: resultado vacio");
        for (int i = 1 ; i == 6; i++ ){
            System.out.println(" i = " + i );
        }

        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> Condicion de limite con igualdad: \n valor inical del iterador y valor de limite son iguales: Solo una ejecucion");
        // En este caso el bucle se ejecutará una sola vez pues el limite y el valor inicial son iguales
        for (int i = 1 ; i == 1; i++ ) {
            System.out.println(" i = " + i);
        }

        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> Operador de variacion del iterador con +=2: ");
        for (int i = 1 ; i < 10; i+=2 ){
            System.out.println(" i = " + i );
        }

        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> Operador de variacion del iterador con *=4: ");
        for (int i = 1 ; i < 10; i*=4 ){
            System.out.println(" i = " + i );
        }

        LectorV2.escribirLinea("");
        LectorV2.escribirLinea(" >> Operador de variacion del iterador con ++ y actualizacion interna con i*3: ");
        for (int i = 1 ; i < 10; i++ ){
            System.out.println(" i = " + i*3 );
        }
    }
}
