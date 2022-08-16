import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, remainder, sum = 0;

        do {
            System.out.print("Pozitif bir sayı giriniz: ");
            number = input.nextInt();
        } while (number <= 0);

        for (int i = 1; i < number; i++) {
            remainder = number % i;
            if (remainder == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + ", bir mükemmel sayıdır.");
        } else {
            System.out.println(number + ", bir mükemmel sayı değildir.");
        }
    }
}
