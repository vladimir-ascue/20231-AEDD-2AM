public class operadores {
    public static void main(String[] args) throws Exception {
        int nota = 32;
        if ((nota <= 20) && (nota >= 0)){
            if ((nota <= 20) && (nota >= 12)){
                System.out.println("Aprobado");
            }else{
                System.out.println("Desaprobado");
            }
        }else{
            System.out.println("ERROR: nota fuera de rango");
        }

        System.out.println("");
        int contador = 0;
        System.out.println("Valor inical = " + contador);

        contador = contador + 1;
        System.out.println("Incremento  con 'contador + 1' = \n\t contador = " + contador);

        contador++;
        System.out.println("Incremento con '++' \n\t contador = " + contador);

        contador = contador - 1;
        System.out.println("Decremento con 'contador - 1' \n\t contador = " + contador);

        contador--;
        System.out.println("Decremento con '--' \n\t contador = " + contador);

        contador += 3;
        System.out.println("Incremento con '+=3' \n\t contador = " + contador);

        contador += 7;
        System.out.println("Incremento con '+=7' \n\t contador = " + contador);

        contador -= 5;
        System.out.println("Decremento con '+=5' \n\t contador = " + contador);

        contador -= 6;
        System.out.println("Decremento con '+=6' \n\t contador = " + contador);

        contador *= 3;
        System.out.println("Producto con '*=3' \n\t contador = " + contador);

        contador *= -4;
        System.out.println("Producto con '*=-4' \n\t contador = " + contador);

        int limite = 15;
        // Si la variable de iteracion (iterador) se define dentro del bucle for,
        // ésta exisitra únicamente dentro del contexto (Llaves de apertura y cierre)
        // del bucle for
        System.out.println("Declaracion de la variable de iteracion dentro del bucle for");
        for (int iterador = 0; iterador < limite; iterador++) {
            System.out.println("El valor actual del iterador es: "+iterador);
        }

        // Si la variable de iteracion (iterador2) se define fuera del bucle for,
        // ésta existra fuera del bucle for pero solo dentro contexto (Llaves de apertura y cierre)
        // del modulo principal (main) y se puede usar fuera del bucle for
        System.out.println("Declaracion de la variable de iteracion fuera del bucle for");
        int iterador2;
        for (iterador2 = 0; iterador2 < limite; iterador2++) {
            System.out.println("El valor actual del iterador2 es: "+iterador2);
        }
        System.out.println("Iterador fuera del bucle for" + iterador2);

        // La variable de iteracion (iterador) puede cambiar su valor dentro de las instrucciones del bucle
        for (int iterador = 0; iterador < limite; iterador++) {
            if (iterador == 3){
                System.out.println("Cambiamos el valor de iterador a 10");
                iterador = 10;
            }
            System.out.println("El valor actual del iterador es: "+iterador);
        }
    }
}