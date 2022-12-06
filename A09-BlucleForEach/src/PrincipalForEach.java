
public class PrincipalForEach {
    public static void main(String[] args) {
        String [] arreglo = new String[5];
        arreglo[0] = "Jessica";
        arreglo[1] = "Antonio";
        arreglo[2] = "Helena";
        arreglo[3] = "Vladimir";
        arreglo[4] = "Carol";

        for (String nombre: arreglo) {
            if(nombre.equals("Vladimir")){
                LectorV2.escribirLinea("Bienvenido " + nombre.toUpperCase());
            }else{
                LectorV2.escribirLinea("Gusto en conocerte " + nombre);
            }
        }

        int contador=0;
        for (Character letra :
                "Vladimir".toCharArray()) {
            contador++;
            LectorV2.escribirLinea(Integer.toString(contador) + "- " + letra.toString());
        }
    }
}
