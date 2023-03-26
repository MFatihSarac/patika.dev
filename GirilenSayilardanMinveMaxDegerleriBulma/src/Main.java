import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int totalNumber, minimumNumber, maximumNumber;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Kaç tane sayı gireceksiniz: ");
            totalNumber = input.nextInt();
        } while (totalNumber < 1);

        int[] numbers = new int[totalNumber];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d. sayıyı giriniz: ", (i + 1));
            numbers[i] = input.nextInt();
        }

        minimumNumber = numbers[0];
        maximumNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimumNumber) {
                minimumNumber = numbers[i];
            }

            if (numbers[i] > maximumNumber) {
                maximumNumber = numbers[i];
            }
        }

        System.out.println("En büyük sayı: " + maximumNumber);
        System.out.println("En küçük sayı: " + minimumNumber);
    }
}
