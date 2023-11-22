import java.util.Random;
import java.util.Scanner;

public class NumerosAleatoriosApp {

	public static void main(String[] args) {
		Random generador = new Random();

		for (int i = 1; i <= 30; i++) {
			double r = generador.nextDouble(1.0, 10.0);
			System.out.print((int) r + "\t");
		}

		System.out.println("\n");

		// Escribe un programa que obtenga los números enteros comprendidos entre
		// dos números introducidos por teclado y validados como distintos, el programa
		// debe empezar por el menor de los enteros introducidos e ir incrementando de
		// 7 en 7.

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int numero2 = 0;

		do {
			System.out.print("Introduce un número entero: ");
			numero = Integer.parseInt(sc.nextLine());
			System.out.print("Introduce el segundo número entero: ");
			numero2 = Integer.parseInt(sc.nextLine());
			if (numero >= numero2) {
				System.out.println("El primer número no puede ser mayor o igual que el segundo. Vuelve a intentarlo.");
			}
		} while (numero >= numero2);

		for (int i = numero; i <= numero2; i = i + 7) {
			System.out.println(i);
		}

		System.out.print("Añade un tercer número (sólo se mostrará si está entre los dos anteriores: ");
		int numero3 = Integer.parseInt(sc.nextLine());

		if ((numero3 >= numero) && (numero3 <= numero2)) {
			System.out.println("El tercer número es: " + numero3);
		} else {
			System.out.println("El tercer número no está comprendido entre " + numero + " y " + numero2 + ".");
		}

	}

}
