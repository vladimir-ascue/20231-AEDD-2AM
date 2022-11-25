import java.util.Scanner;

public class LectorJava {
	@SuppressWarnings("resource")
	private static int LeerEntero() {
		Boolean flagEntero = true;
		int entero = 0;
		do {
			try {
				Scanner lector = new Scanner(System.in);
				System.out.println("Infrese un número entero: ");
				entero = lector.nextInt();
				flagEntero = false;
			} catch (Exception e) {
				System.out.println("Error: Debe ingresar un número entero: ");
				flagEntero = true;
				System.out.print("Intentelo nuevamente: ");
			}
		} while (flagEntero);
		return entero;
	}

	@SuppressWarnings("resource")
	private static double LeerReal() {
		Boolean flagReal = true;
		double real = 0;
		do {
			try {
				Scanner lector = new Scanner(System.in);
				System.out.println("Infrese un número real: ");
				real = lector.nextDouble();
				flagReal = false;
			} catch (Exception e) {
				System.out.println("Error: Debe ingresar un número real: ");
				flagReal = true;
				System.out.print("Intentelo nuevamente: ");
			}
		} while (flagReal);
		return real;
	}

	@SuppressWarnings("resource")
	private static String LeerTexto() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Infrese un número texto: ");
		String texto = lector.nextLine();
		return texto;
	}

	private static void escribir(String texto) {
		System.out.print(texto);
	}

	private static void escribirLinea(String texto) {
		System.out.print(texto);
	}

	public static void main(String[] args) throws Exception {

	}
}
