import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class principal {
    public static void main(String[] args) {
//        CLista lista1 = new CLista();
//        System.out.println("Tamaño: " + lista1.getSize());
//
//        lista1.add(0,"Vladimir");
//        lista1.add(1,"Ilich");
//        lista1.add(2,"Ascue");
//        lista1.add(3,"Lovón");
//
//        System.out.println("Tamaño: " + lista1.getSize());
//        lista1.show();
//
//        lista1.remove(2);
//
//        System.out.println("Tamaño: " + lista1.getSize());
//        lista1.show();
//
//        lista1.remove("Ascue");
//
//        System.out.println("Tamaño: " + lista1.getSize());
//        lista1.show();
//
//        lista1.remove("Lovón");
//
//        System.out.println("Tamaño: " + lista1.getSize());
//        lista1.show();
//
//        lista1.remove(0);
//        lista1.show();
//        lista1.remove("Ilich");
//        lista1.show();
//
//        lista1.add(0,"Yerson");
//        lista1.add(3,"Ruben");
//        lista1.add(1,"Pepe");
//        lista1.add(2,"Frida Kalho");
//        lista1.add(9,"Frida Kalho");
//
//        lista1.show();

        List<String> listita = new ArrayList<String>();
        listita.add(0,"Aristoteles");
        listita.add(1,"Casimiro");
        listita.add(2,"Socrates");
        listita.add(1,"Jhoel");

        for (String l: listita) {
            System.out.println(l);
        }

        // Stack >> Pilas
        // Queue >> Colas
    }
}