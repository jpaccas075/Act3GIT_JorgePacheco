import java.util.Random;

public class NumerosAleatoriosApp {

	public static void main(String[] args) {
		Random generador = new Random();

		for (int i = 1; i <= 10; i++) {
			double r = generador.nextDouble(1.0, 10.0);
			System.out.print((int) r + "\t");
		}

	}

}
