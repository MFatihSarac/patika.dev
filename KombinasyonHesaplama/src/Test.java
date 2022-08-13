import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long factorial1 = 1, factorial2 = 1;

        System.out.print("C(n, r) için n'yi giriniz: ");
        int n = input.nextInt();
        System.out.print("C(n, r) için r'yi giriniz: ");
        int r = input.nextInt();

        /* Payın sadeleştirilmiş halini hesaplar. Örneğin n=9 r=4 için pay 9!, payda 5! olur.
        Sadeleşince payda 9*8*7*6 kalır. */
        for (int i = n; i > (n - r); i--) {
            factorial1 *= i;
        }

        // Paydadaki "r!" değerini hesaplayan kod.
        for (int j = 1; j <= r; j++) {
            factorial2 *= j;
        }

        long result = factorial1 / factorial2;
        System.out.println(result);
    }
}
