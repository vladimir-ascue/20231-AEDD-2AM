public class principal {
    public static void main(String[] args) {
        CLista lista1 = new CLista();
        System.out.println("Tamaño: " + lista1.getSize());

        lista1.add(0,"Vladimir");
        lista1.add(1,"Ilich");
        lista1.add(2,"Ascue");
        lista1.add(3,"Lovón");
        lista1.show();
        System.out.println("Tamaño: " + lista1.getSize());

    }
}
