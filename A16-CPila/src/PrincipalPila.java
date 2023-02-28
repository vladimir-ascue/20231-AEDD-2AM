import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrincipalPila {
    public static void main(String[] args) {
        CPila pila = new CPila();

        pila.add(pila.getSize(),"Vladimir");
        pila.add(pila.getSize(),"Ilich");
        pila.add(pila.getSize(),"Ascue");
        pila.add(pila.getSize(),"Lovón");

        pila.show();
        System.out.println(pila.peek());
        pila.show();

        System.out.println(pila.pop());

        pila.show();

//
//        System.out.println("tamaño = " + pila.getSize());
//
//        pila.remove(3);

        pila.show();
    }
}
