import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double numero;

		System.out.println("Digite um valor qualquer de 0 a 100: ");
		numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("INVALIDO! Digite um numero de 0 a 100");

		} else if (numero <= 25.0) {
			System.out.println("Intervalo (0,25]");

		} else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");

		} else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");

		} else {
			System.out.println("Intervalo (75,100]");

		}
		sc.close();

	}

}
