import java.util.ArrayDeque;
import java.util.Queue;

public class colas {
    public static void main(String[] args) {
        Queue<String> cola = new ArrayDeque<>();

        cola.add("Vladimir"); // 0
        System.out.println(cola.size());
        cola.add("Ilich"); // 1
        System.out.println(cola.size());
        cola.add("Ascue"); // 2
        System.out.println(cola.size());
        cola.add("Lovón"); //3
        System.out.println(cola.size());

        System.out.println("Iniciando POLL");

        System.out.println("POLL "+cola.poll());
        System.out.println(cola.size());
        System.out.println("POLL "+cola.poll());
        System.out.println(cola.size());
        System.out.println("POLL "+cola.poll());
        System.out.println(cola.size());
        System.out.println("POLL "+cola.poll());
        System.out.println(cola.size());

        System.out.println("Iniciando PEEK");
        System.out.println("Peek "+cola.peek());
        System.out.println(cola.size());
        System.out.println("Peek "+cola.peek());
        System.out.println(cola.size());
        System.out.println("Peek "+cola.peek());
        System.out.println(cola.size());
        System.out.println("Peek "+cola.peek());
        System.out.println(cola.size());
        System.out.println("Peek "+cola.peek());
        System.out.println(cola.size());
        System.out.println("Peek "+cola.peek());
        System.out.println(cola.size());

//        for (int i = 0; i < cola.size(); i++) {
//            System.out.print(i+"- ");
//            System.out.println(cola.poll());
//        }
//

//        System.out.println("Iniciando ELEMENT");
//        System.out.println("Element "+cola.element());
//        System.out.println(cola.size());
//        System.out.println("Element "+cola.element());
//        System.out.println(cola.size());
//        System.out.println("Element "+cola.element());
//        System.out.println(cola.size());
//        System.out.println("Element "+cola.element());
//        System.out.println(cola.size());
//        System.out.println("Element "+cola.element());
//        System.out.println(cola.size());
//        System.out.println("Element "+cola.element());
//        System.out.println(cola.size());

//        for (int i = 0; i < cola.size(); i++) {
//            System.out.print(i+"- ");
//            System.out.println(cola.peek());
//        }
    }
}
