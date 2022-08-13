import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 1;

        System.out.print("Tabanı giriniz: ");
        int base = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " üssü " + exponent + " = " + result);
    }
}
