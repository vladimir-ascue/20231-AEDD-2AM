public class principal {
    public static void main(String arg[]){

        String ciudad = Lector.LeerTexto("Ingrese nombre de ciudad: ");
        switch (ciudad){
            case "Lima":
                Lector.escribirLinea("La ciudad es: " + ciudad);
                break;
            case "Cusco":
                Lector.escribirLinea("La ciudad es:  " + ciudad);
                break;
            case "Arequipa":
                Lector.escribirLinea("La ciudad es:  " + ciudad);
                break;
            default:
                Lector.escribirLinea("El nombre no esta registraado.");
                break;
        }
    }
}
