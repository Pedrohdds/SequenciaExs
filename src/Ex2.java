import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
System.out.println("Digite um numero inteiro e verifique se o numero é positivo ou negativo");
numero = sc.nextInt();
		if ((numero % 2) == 0) {
			System.out.println("Numero Postivo");
		}else {
			System.out.println("Numero Negativo");
		}
		sc.close();
	}

}
