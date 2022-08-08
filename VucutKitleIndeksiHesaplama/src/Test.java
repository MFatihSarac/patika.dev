import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu \",\" kullanarak metre cinsinden giriniz: ");
        double boy = input.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        double kilo = input.nextDouble();

        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
