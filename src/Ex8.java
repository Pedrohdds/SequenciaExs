import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double valorSalario;

		System.out.println("Digite o valor do salario com 2 casas decimais e calcule o imposto: ");
		valorSalario = sc.nextDouble();

		if (valorSalario < 0) {
			System.out.println("Digite um saldo Positivo");
		} else if (valorSalario < 2000) {
			System.out.println("Isento de impostos");
		} else if (valorSalario > 2000 && valorSalario < 3000) {

		}

	}

}
