import java.util.Scanner;

public class InputConsole {

	public static void main() {
		// associar objeto scanner ao teclado no modo console
		Scanner sc = new Scanner(System.in);
		// separar por enter ou espaço o valor das variaveis
		String texto;
		texto = sc.next();
		
		int inteiro;
		inteiro = sc.nextInt();
		
		double flutoante;
		flutoante = sc.nextDouble();

		char letra;
		letra = sc.next().charAt(0);
		
		System.out.println("Voce digitou: " + texto);
		System.out.println("Voce digitou: " + inteiro);
		System.out.println("Voce digitou: " + flutoante);
		System.out.println("Voce digitou: " + letra);

		// separar por enter o valor das variaveis
		String s1;
		// evitar quebra de linha pendente
		sc.nextLine();
		s1 = sc.nextLine();
		System.out.println("Voce digitou: " + s1);

		sc.close();		
	}

}
