import java.util.Scanner;

public class Lector {
	@SuppressWarnings("resource")
	private static int LeerEntero(String mensaje) {
		Boolean flagEntero = true;
		int entero = 0;
		do {
			try {
				Scanner lector = new Scanner(System.in);
				System.out.println(mensaje);
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
	private static double LeerReal(String mensaje) {
		Boolean flagReal = true;
		double real = 0;
		do {
			try {
				Scanner lector = new Scanner(System.in);
				System.out.println(mensaje);
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
	private static String LeerTexto(String mensaje) {
		System.out.print(mensaje);
		return new Scanner(System.in).nextLine();
	}

	private static void escribir(String texto) {
		System.out.print(texto);
	}

	private static void escribirLinea(String texto) {
		System.out.println(texto);
	}

	public static void main(String[] args) throws Exception {
		String nombre = LeerTexto("Ingrese su nombre");
		escribirLinea("Su nombre es: " + nombre);

		int edad = LeerEntero("Ingrese su edad: ");
		escribirLinea("Su edad es: " + edad);

		double estatura = LeerReal("Ingrese su estatura: ");
		escribir("Su estatura es: " + estatura);
	}
}
