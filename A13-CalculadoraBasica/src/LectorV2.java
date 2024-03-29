import java.util.Scanner;

public class LectorV2 {
	private static Scanner lector;
	@SuppressWarnings("resource")
	protected static int leerEntero(String mensaje) {
		Boolean flagEntero = true;
		int entero = 0;
		do {
			try {
				System.out.print(mensaje); // Escribe el "Promt"
				lector = new Scanner(System.in);
				entero = lector.nextInt(); // Convierte a entero
				flagEntero = false; // Cambia el estado de flagEntero para que termine el bucle
			} catch (Exception e) {
				System.out.println("Error: Debe ingresar valor entero: ");
				flagEntero = true; // Cambia el estado de flagEntero para que continue el bucle
				System.out.print("Intentelo nuevamente: ");
			}
		} while (flagEntero);
		return entero;
	}

	@SuppressWarnings("resource")
	protected static double leerReal(String mensaje) {
		Boolean flagReal = true;
		double real = 0;
		do {
			try {
				System.out.print(mensaje);
				real = lector.nextDouble();
				flagReal = false;
			} catch (Exception e) {
				System.out.println("Error: Debe ingresar un valor real: ");
				flagReal = true;
				System.out.print("Intentelo nuevamente: ");
			}
		} while (flagReal);
		return real;
	}

	@SuppressWarnings("resource")
	protected static String LeerTexto(String mensaje) {
		System.out.print(mensaje);
		String texto = lector.nextLine();
		return texto;
	}

	protected static void escribir(String texto) {
		System.out.print(texto);
	}

	protected static void escribirLinea(String texto) {
		System.out.println(texto);
	}
}