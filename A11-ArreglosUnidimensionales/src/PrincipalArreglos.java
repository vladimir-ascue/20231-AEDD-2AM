public class PrincipalArreglos {
    public static void main(String[] args) throws Exception {
        // Arreglos: Una variable, varios datos del mismo tipo (int, String, double ...). Llamados tambien Vectores
        // Tamaño fijo
        // Un solo tipo de dato en un arreglo

        // tamaño = 5 >> { 2, 4, 10, 0 , 6}
        // tamaño = 6 >> { 4, 0, 2, 0, 0,0}
        int[] a = new int[5];  // Al inicializar el arreglo todos sus elementos son 0
        System.out.println("elmento a4 = " + a[3]);

        String [] b = new String[5];
        System.out.println("elemento b3 = " + b[2]);

        // Declaracion y asignacion de valores de un arreglo de tamño 6
        // La asignación de valores de un arreglo mediante la notacion con "{ }" solamente se puede usar al momento de su declaración
        String[] alumnos = {"Vladimir", "Ilich", "Agueda", "Jessica", "Helena", "Massiel"};
        // Los indices de posicion de los valores del arreglo se numeran contando a partir del 0
        // Indices           0           1        2         3          4         5
        // Numero Elemento   1           2        3         4          5         6
       
        // Se accede a cada posicion del arreglo usando los indices comprendidos entre 0 y el tamaño-1 del arreglo
        // Para conocer el tamaño de un arreglo podemos usar la propiedad length que devuelve un valor entero

        Lector.escribirLinea("Arreglo con los valores iniciales:");
        // Iterator se abrevia con i

        // La longitud (Tamaño) del arreglo es = a el mayor indice +1
        // El mayot indice del arreglo es = al tamaño (longitud) -1
        // indiceMayor = longitud - 1
        // longitud = indiceMayor + 1

        for (int i = 0 ; i < alumnos.length ; i++){
            Lector.escribirLinea(" - " + alumnos[i]);
        }

        // Asignacion individual de valores
        // Para nuestro caso:
        //   Tamaño del arreglo 6
        //   Indices 0, 1, 2, 3, 4, 5
        alumnos[0] = "Platon";
        alumnos[1] = "Aristoteles";
        alumnos[2] = "Pitagoras";
        alumnos[3] = "Socrates";
        alumnos[4] = "Descartes";
        alumnos[5] = "Plotino";

        Lector.escribirLinea("Arreglo con los valores modificados:");
        // i++ Es el incremento de uno en uno
        for (int i = 0 ; i < alumnos.length ; i++){
            Lector.escribirLinea(" - " + alumnos[i]);
        }

        Lector.escribirLinea("Cambiaremos los nombres otra vez");
        for(int i = 0; i < alumnos.length; i++){
            Lector.escribir("alumnos["+i+"]=");
            alumnos[i] = Lector.LeerTexto();
        }

        for (int i = 0 ; i < alumnos.length ; i++){
            Lector.escribirLinea(" - " + alumnos[i]);
        }
    }
}
