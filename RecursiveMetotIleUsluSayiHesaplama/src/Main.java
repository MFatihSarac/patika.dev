import java.util.Scanner;

public class Main {

    public static double exponentiate(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            exponent *= -1;
            return 1 / (base * exponentiate(base, exponent - 1));
        }

        return (base * exponentiate(base, exponent - 1));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();

        if (base == 0 && exponent == 0) {
            System.out.println("0 üssü 0 tanımsızdır.");
        } else {
            System.out.println(exponentiate(base, exponent));
        }
    }
}
