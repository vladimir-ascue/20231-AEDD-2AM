public class principal {
    public static void main(String[] args) {
        CLista lista1 = new CLista();
        lista1.add(0,"Vladimir");
        System.out.println("Posicion 0: " + lista1.get(0));
        lista1.add(0,"Ilich");
        System.out.println("Posicion 0: " + lista1.get(0));
        System.out.println("Posicion 1: " + lista1.get(1));
        lista1.add(0,"Ascue");
        System.out.println("Posicion 0: " + lista1.get(0));
        System.out.println("Posicion 1: " + lista1.get(1));
        System.out.println("Posicion 2: " + lista1.get(2));
        lista1.add(1,"Lovón");
        System.out.println("Posicion 0: " + lista1.get(0));
        System.out.println("Posicion 1: " + lista1.get(1));
        System.out.println("Posicion 2: " + lista1.get(2));
        System.out.println("Posicion 3: " + lista1.get(3));
        lista1.add(7,"Salchicha");
        System.out.println("Posicion 6: " + lista1.get(6));
        System.out.println("Posicion 7: " + lista1.get(7));
        // a- Ilich Vladimir
        // b- Vladimir Ilich
    }
}
