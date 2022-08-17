import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 1, c;

        System.out.print("Fibonacci serisinin kaç elemanını görmek istiyorsunuz: ");
        int numberOfElements = input.nextInt();

        if (numberOfElements == 0) {
            System.out.println("Geçersiz bir değer girdiniz!");
        } else if (numberOfElements == 1) {
            System.out.print("Fibonacci serisinin ilk " + numberOfElements + " elemanı: ");
            System.out.println(first);
        } else if (numberOfElements == 2) {
            System.out.print("Fibonacci serisinin ilk " + numberOfElements + " elemanı: ");
            System.out.println(first + " " + second);
        } else {
            System.out.print("Fibonacci serisinin ilk " + numberOfElements + " elemanı: ");
            System.out.print(first + " " + second + " ");
            for (int i = 1; i <= (numberOfElements - 2); i++) {
                c = first + second;

                if (i == (numberOfElements - 2)) {
                    System.out.print(c);
                } else {
                    System.out.print(c + " ");
                }

                first = second;
                second = c;

            }
        }
    }
}
