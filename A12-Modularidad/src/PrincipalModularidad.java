import org.jetbrains.annotations.NotNull;

public class PrincipalModularidad {
    // Los procedimientos o métodos se declaran haciendo uso de la palabra reservada void
    // Ejecutan las intrucciones indicadas en su cuerpo, pero no devuelven un valor
    public static void menu(){
        LectorV2.escribirLinea("#####################################");
        LectorV2.escribirLinea("<****> OPERACIONES CON ARRELOS <****>");
        LectorV2.escribirLinea("#####################################");
        LectorV2.escribirLinea("Instrucciones que se ejecutarán cada vez que el procedimiento sea invocado");

        for (int i = 0; i < 5; i++) {
            LectorV2.escribirLinea("Valor de i = " + i);
            if( i % 2 == 0){
                LectorV2.escribirLinea("\ti es un número par");
            }else {
                LectorV2.escribirLinea("\ti es un número inpar");
            }
        }
    }

    // Los procedimientos o métodos pueden recibir parámetos, que deben ser declarados
    // usando el tipo de dato y el normbre respectivo
    public static void mostarArreglo(int [] arreglo){
        LectorV2.escribir("[ ");
        for (int i = 0; i < arreglo.length; i++) {
            LectorV2.escribir(arreglo[i]+" ");
        }
        LectorV2.escribirLinea("]");
    }

    // Las funciones se declaran haciendo uso del tipo de dato que deben retronar al finalizar
    // la ejecucion de las instrucciones de su cuerpo
    // las funciones así como los métodos puede o no tener parámetros
    public static int ubicacionElemento(int[] arreglo, int buscado){
        int indice = -1;
        for (int iterador = 0; iterador < arreglo.length; iterador++) {
            if ( arreglo[iterador] == buscado){
                indice = iterador;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        LectorV2.escribirLinea("Invocación al método menu():");
        menu();
        LectorV2.escribirLinea("");

        int [] arreglo = { 2, 3, 4, 5, 6, 7 };
        LectorV2.escribirLinea("Invocación al método mostrarArreglo:");
        mostarArreglo( arreglo );
        LectorV2.escribirLinea("");

        LectorV2.escribirLinea("Invocación a la función ubicacionElemento():");

        LectorV2.escribirLinea("");
        LectorV2.escribirLinea("Asignando el valor retornado por la funcion a una variable");

        // como la funcion retorna un valor, esta puese ser asignada como valor a una variable
        int buscado = 5;
        int posicion = ubicacionElemento(arreglo,buscado);

        if (posicion >= 0 ){
            LectorV2.escribirLinea(buscado + " está en la posición " + posicion + " del arreglo.");
        }else{
            LectorV2.escribirLinea(buscado + " no se encuentra en el arreglo.");
        }

        LectorV2.escribirLinea("");
        LectorV2.escribirLinea("usando la funcion como variable");
        // Como la funcion retorna un valor, esta puese usada como una variable
        if (ubicacionElemento(arreglo,buscado) >= 0 ){
            LectorV2.escribirLinea(buscado + " está en la posición " + ubicacionElemento(arreglo,buscado) + " del arreglo.");
        }else{
            LectorV2.escribirLinea(buscado + " no se encuentra en el arreglo.");
        }
    }
}
