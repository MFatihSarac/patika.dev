import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159265359;

        System.out.print("Dairenin yarıçapını (r) giriniz: ");
        double r = input.nextDouble();
        System.out.print("Daire diliminin merkez açısını (a) giriniz: ");
        double a = input.nextDouble();

        double alan = pi * r * r * (a/360);
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
