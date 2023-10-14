import java.util.Scanner;

public class Bitwise {
  public static void main() {
    /**
     * & - e
     * | - ou
     * ^ - ou exclusivo
     */
    Scanner sc = new Scanner(System.in);
    // 0b indica que é numero binário
    int mask = 0b00100000;
    int n = sc.nextInt();

    if ((n & mask) != 0) {
      System.out.println("6º bit é verdadeiro");
    } else {
      System.out.println("6º bit é false");
    }

    sc.close();
  }
}
