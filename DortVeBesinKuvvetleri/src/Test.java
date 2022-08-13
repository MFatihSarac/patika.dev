import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayı giriniz: ");
        int number = input.nextInt();

        System.out.print(number + " sayısından küçük 4'ün kuvvetleri: ");
        for (int i = 1; i < number; i *= 4) {
            System.out.print(i + "  ");

        }

        System.out.println();
        System.out.print(number + " sayısından küçük 5'in kuvvetleri: ");
        for (int i = 1; i < number; i *= 5) {
            System.out.print(i + "  ");

        }
    }
}
