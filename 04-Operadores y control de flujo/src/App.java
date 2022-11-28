public class App {
    public static void main(String[] args) throws Exception {
        double nota = 32;

            // false && true >>  false
        if( !((nota <= 20) && (nota >= 0)) ){
            System.out.println("ERROR: La nota esta fuera de rango.");
        }else{
            
            if ( (nota < 20) && (nota > 12) ){

                System.out.println("nota = " + nota + ". Aprobado");
            }else{
    
                System.out.println("nota = " + nota + ". Desaprobado");
            }
        }

        int edad = 23;
        if ( edad == 18 ){
            System.out.println("Debe sacar su libreta militar");
        }

        System.out.println("Sigue con su vida");
        
    }
}
