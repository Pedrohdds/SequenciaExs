import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaTotal,horaInicial,horaFinal;
		

		
		System.out.println("Digite a hora inicial do jogo");
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo");
		horaFinal = sc.nextInt();
		
		;
		
		if(horaInicial < horaFinal) {
			horaTotal = horaFinal - horaInicial;
		 } else {
			horaTotal = 24 - horaInicial + horaFinal;
		  }
		
		System.out.printf("O jogo teve duração de %d horas!",horaTotal);
		sc.close();
	}

}
