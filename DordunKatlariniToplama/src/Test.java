import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        do {
            System.out.print("Pozitif bir sayı giriniz: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);

        System.out.println("Girdiğiniz sayılardan 4'ün katlarının toplamı: " + sum);
    }
}
