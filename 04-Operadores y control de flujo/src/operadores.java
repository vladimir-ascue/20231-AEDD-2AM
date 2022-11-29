public class operadores {
    public static void main(String[] args) throws Exception {
        int nota = Lector.LeerEntero();
        if ((nota <= 20)&& (nota >= 0)){
            if ((nota <= 20) && (nota >= 12)){
                Lector.escribirLinea("Aprobado");
            }else{
                Lector.escribirLinea("Desaprobado");
            }
        }else{
            Lector.escribirLinea("ERROR: nota fuera de rango");
        }
    }
}