import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, upperSide, w;

        do {
            System.out.print("Tek bir sayı giriniz: ");
            number = input.nextInt();
        } while (number % 2 == 0);

        upperSide = (number + 1) / 2;

        for (int i = 1; i <= upperSide; i++) {
            for (int j = 1; j <= (upperSide - i); j++) {
                System.out.print(" ");
            }

            for (int t = 1; t <= (2 * i - 1); t++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int k = (upperSide + 1); k <= number; k++) {
            for (int p = 1; p <= (k - upperSide); p++) {
                System.out.print(" ");
            }

            w = 2 * upperSide - k;
            for (int m = 1; m <= (2 * w - 1); m++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
