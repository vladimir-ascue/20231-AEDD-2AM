import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrincipalPila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();
        pila.add("Vladimir");
        pila.add("Ilich");
        pila.add("Ascue");
        pila.add("Lovón");

        pila.add(2,"Pepito");
        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());

//        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());

//        System.out.print(pila.push("Aristoteles")); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.push("Anaximandro")); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.push("Anaximenes")); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.push("Anaxagoras")); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.push("Pitagoras")); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.push("Sófocles")); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.push("Galileo")); System.out.println("Tamaño: "+pila.size());

//        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());
//        System.out.print(pila.peek()); System.out.println("Tamaño: "+pila.size());

        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
        System.out.print(pila.pop()); System.out.println("Tamaño: "+pila.size());
    }
}
