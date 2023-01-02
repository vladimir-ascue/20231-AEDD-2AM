import java.util.Scanner;

public class scan {
	private static Scanner lector = new Scanner(System.in);
	@SuppressWarnings("resource")
	protected static int leerEntero(String mensaje) {
		Boolean flagEntero = true;
		int entero = 0;
		do {
			try {
				System.out.print(mensaje);
				entero = lector.nextInt();
				flagEntero = false;
			} catch (Exception e) {
				System.out.println("Error: Debe ingresar valor entero: ");
				flagEntero = true;
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

	/***
	 * Esta funcion escribe un texto sin cambiar de linea
	 * @param texto: String Texto que se desea escribir
	 ***/
	protected static void escribir(String texto) {
		System.out.print(texto);
	}

	/***
	 * Esta funcion escribe un salto de linea
	 */
	protected static void escribir() {
		System.out.println();
	}

	protected static void escribirLinea(String texto) {
		System.out.println(texto);
	}
}