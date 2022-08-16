import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, w;

        do {
            System.out.print("Pozitif bir sayı giriniz: ");
            number = input.nextInt();
        } while (number <= 0);

        for (int i = 1; i <= number; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }

            w = number - i + 1;
            for (int j = 1; j <= (2 * w - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
