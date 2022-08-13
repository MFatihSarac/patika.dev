import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digitNumber, sum = 0, temporaryNumber;

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        temporaryNumber = number;

        while (temporaryNumber != 0) {
            digitNumber = temporaryNumber % 10;
            temporaryNumber /= 10;
            sum += digitNumber;
        }

        System.out.println(number + " sayısının basamak rakamlarının toplamı: " + sum);
    }
}
