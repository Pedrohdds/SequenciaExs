import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
int numeroDigitado;

System.out.println("Digite um numero e verifique se seu numero é maior ou menor que zero");
numeroDigitado = sc.nextInt();

if (numeroDigitado < 0) {
	System.out.println("Numero negativo");
	
} else {
	System.out.println("Numero Positivo");
}
sc.close();
	}

}
