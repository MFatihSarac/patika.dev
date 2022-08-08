import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Üçgenin 1. kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("Üçgenin 2. kenarını giriniz: ");
        b = input.nextInt();
        System.out.print("Üçgenin 3. kenarını giriniz: ");
        c = input.nextInt();

        double u = (a + b + c) / 2;

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
