import java.util.Scanner;

public class RepetitionStructure {
  public static void fwhile() {
    Scanner sc = new Scanner(System.in);

    int inputNumber;
    int sum = 0;
    inputNumber = sc.nextInt();

    while (inputNumber != 0) {
      sum += inputNumber;
      System.out.println("Numero: " + inputNumber);
      System.out.println("Soma: " + sum);

      inputNumber = sc.nextInt();
    }

    sc.close();
  }

  public static void ffor() {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int inputNumber;
    System.out.print("Digite a quantidade de vezes: ");
    int qtd = sc.nextInt();

    for (int i = 0; i < qtd; i++) {
      System.out.print("Digite um numero: ");
      inputNumber = sc.nextInt();
      sum += inputNumber;
    }
    System.out.println("Soma: " + sum);
    sc.close();
  }
}
