import java.util.Scanner;
import javax.swing.*;
import java.util.Locale;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame("HelloWorldSwing");
		Locale.setDefault(Locale.US);
		frame.pack();

		int codigoItem, quantidadeItem;
		double valorItem, calculo;

		System.out
				.println("Qual codigo do item? 1-Cachorro quente 2-X-Salada 3-x-Bacon 4-TorradaSimples 5-Refrigerante");
		codigoItem = sc.nextInt();

		System.out.println("Qual a quantidade de item ?");
		quantidadeItem = sc.nextInt();

		valorItem = 0;
		calculo = 0;

		if (codigoItem == 1) {
			valorItem = 4;
			calculo = quantidadeItem * valorItem;
			System.out.printf("Total: R$", calculo);

		} else if (codigoItem == 2) {
			valorItem = 4.50;
			calculo = quantidadeItem * valorItem;
			System.out.printf("Total: R$%.2f%n", calculo);

		} else if (codigoItem == 3) {
			valorItem = 5;
			calculo = quantidadeItem * valorItem;
			System.out.printf("Total: R$%.2f%n", calculo);
		} else if (codigoItem == 4) {
			valorItem = 2;
			calculo = quantidadeItem * valorItem;
			System.out.printf("Total: R$%.2f%n", calculo);
		} else if (codigoItem == 5) {
			valorItem = 1.50;
			calculo = quantidadeItem * valorItem;
			System.out.printf("Total: R$%.2f%n", calculo);
		} else {
			System.out.println("Digite um valor valido!");
		}

		sc.close();

	}

}
