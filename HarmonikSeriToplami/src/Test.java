import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        System.out.print("Harmonik serinin n değerini giriniz: ");
        int n = input.nextInt();

        for (int j = 1; j <= n; j++) {
            sum += (1.0 / j);
        }

        System.out.println("Harmonik serinin ilk " + n + " teriminin toplamı: " + sum);
    }
}
