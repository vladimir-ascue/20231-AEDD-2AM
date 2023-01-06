public class PrincipalConjuntos {
    public static int menu(){
        LectorV2.escribirLn("#########       MENU PRINCIPAL      #########");
        LectorV2.escribirLn("######### OPERACIONES CON CONJUNTOS #########");
        LectorV2.escribirLn("0- Salir");
        LectorV2.escribirLn("1- Union");
        LectorV2.escribirLn("2- Interseccion");
        LectorV2.escribirLn("3- Diferencia");
        LectorV2.escribirLn("4- Diferencia Simétrica");
        LectorV2.escribirLn("5- Cambiar conjuntos");
        return LectorV2.leerEntero(">> Ingrese una opcion (0 - 5)");
    }
    public static int[] leerConjunto(String nombre, int tam){
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            a[i] = LectorV2.leerEntero(nombre+"["+i+"]");
        }
        return a;
    }

    public static void mostrarConjunto(String nombre, int[] conj){
        LectorV2.escribir(nombre+" = { ");
        for (int i = 0; i < conj.length; i++) {
            if ( i == conj.length-1 )
                LectorV2.escribir(conj[i]+"");
            else
                LectorV2.escribir(conj[i] + ", ");
        }
        LectorV2.escribirLn(" }");
    }

    // ConjA = { 2,3,4,5 }  Length = 4
    //           0 1 2 3
    // ConjA = { 3,4,6 } Length = 3
    // cuantos duplicados hay dup = 2
    // tamUnion = 5 <<< tamUnion = 4+3-2 <<< tamUnion = tamConjA + tamConjB - dup
    // union = { 2,3,4,5,6 }
    //           0 1 2 3 4

    public static int[] unir(int[] conjA, int[] conjB){
        int dup = 0;
        // DETERRMINAR EL NUMERO DE DUPLICADOS ENTRO LOS CONJUNTOS
        for (int i = 0; i < conjA.length; i++) {
            for (int j = 0; j < conjB.length; j++) {
                if(conjA[i] == conjB[j])
                    dup++;
            }
        }
        // DETERMINAR EL TAMAÑO DEL CONJUNOT UNION
        int tamUnion = conjA.length + conjB.length - dup;

        // CREAR EL CONJUNTO UNION -- AÚN SIN ELEMENTOS SIN INICIALIZAR
        int[] union = new int[tamUnion];

        // COPIAMOS TODOS LOS ELEMENTOS DE A EN UNION
        for (int i = 0; i < conjA.length; i++) {
            union[i] = conjA[i];
        }
        // COPIAMOS LOS ELEMENTOS DE B QUE NO ESTAN EN UNION
       // A= {2,3,4,5};  B = {3,4,6}; U={2,3,4,5,6}
        int cont = 0;
        for (int i = 0; i < conjB.length; i++) {
            if (!existe(conjB[i],union)) {
                union[conjA.length + cont] = conjB[i];
            }
        }
        return union;
    }

    public static Boolean existe(int elem, int[] conj){
        Boolean flag = false;
        for (int i = 0; i < conj.length; i++) {
            if (elem == conj[i])
                flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        LectorV2.escribirLn("######### OPERACIONES CON CONJUNTOS #########");

        String nombre1 = LectorV2.leertexto("Nombre de primer Conjunto");
        int tam1 = LectorV2.leerEntero("Tamaño de "+nombre1);
        int[] A = leerConjunto(nombre1,tam1);
        mostrarConjunto(nombre1,A);

        String nombre2 = LectorV2.leertexto("Nombre de segundo Conjunto");
        int tam2 = LectorV2.leerEntero("Tamaño de "+nombre2);
        int[] B = leerConjunto(nombre2,tam2);

        int opcion = menu();

        switch ( opcion ){
            case 0:
                LectorV2.escribirLn("Adios ...");
                break;
            case 1:
                LectorV2.escribirLn("Vamos a UNIR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                int[] union = unir(A,B);
                mostrarConjunto(nombre1+ " U "+nombre2 +" = ", union);
                LectorV2.escribirLn("Aui todo bien.");
                break;
            case 2:
                LectorV2.escribirLn("Vamos a INTERSECTAR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 3:
                LectorV2.escribirLn("Vamos a hallar la DIFERENCIA de los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 4:
                LectorV2.escribirLn("Vamos a hallar la DIFERENCIA SIMÉTRICA de los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 5:
                LectorV2.escribirLn("Vamos a CAMBIAR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            default:
                LectorV2.escribirLn("Opcion fuera de rango (0 - 5)");
                break;
        }
    }
}