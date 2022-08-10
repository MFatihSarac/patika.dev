import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını derece cinsinden giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Bu havada kayak yapabilirsiniz.");
        } else if (sicaklik < 15) {
            System.out.println("Bu havada sinemaya gidebilirsiniz.");
        }
        if (sicaklik >= 10 && sicaklik <= 25) {
            System.out.println("Bu havada piknik yapabilirsiniz.");
        } else if (sicaklik > 25) {
            System.out.println("Bu havada yüzmeye gidebilirsiniz.");
        }
    }
}
