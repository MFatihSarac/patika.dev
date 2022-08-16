import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, gcd = 1, lcm = 1;

        do {
            System.out.print("1. pozitif sayı: ");
            number1 = input.nextInt();

        } while (number1 <= 0);

        do {
            System.out.print("2. pozitif sayı: ");
            number2 = input.nextInt();
        } while (number2 <= 0);

        if (number1 <= number2) {
            int i = number1;
            while (i > 0) {
                if (number1 % i == 0 && number2 % i == 0) {
                    gcd = i;
                    break;
                }
                i--;
            }
        } else {
            int j = number2;
            while (j > 0) {
                if (number1 % j == 0 && number2 % j == 0) {
                    gcd = j;
                    break;
                }
                j--;
            }
        }

        // EKOK bulmak için şu kod da kullanılabilir: lcm = (number1 * number2) / gcd;
        int p = 1;
        while (p <= (number1 * number2)) {
            if (p % number1 == 0 && p % number2 == 0) {
                lcm = p;
                break;
            }
            p++;
        }

        System.out.println(number1 + " ve " + number2 + " sayılarının EBOB'u: " + gcd);
        System.out.println(number1 + " ve " + number2 + " sayılarının EKOK'u: " + lcm);
    }
}
