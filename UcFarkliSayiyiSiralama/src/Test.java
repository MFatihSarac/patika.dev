import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = input.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.println("Sonuç: " + (sayi1 + "<" + sayi2 + "<" + sayi3));
            } else {
                System.out.println("Sonuç: " + (sayi1 + "<" + sayi3 + "<" + sayi2));
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                System.out.println("Sonuç: " + (sayi2 + "<" + sayi1 + "<" + sayi3));
            } else {
                System.out.println("Sonuç: " + (sayi2 + "<" + sayi3 + "<" + sayi1));
            }
        } else {
            if (sayi1 < sayi2) {
                System.out.println("Sonuç: " + (sayi3 + "<" + sayi1 + "<" + sayi2));
            } else {
                System.out.println("Sonuç: " + (sayi3 + "<" + sayi2 + "<" + sayi1));
            }
        }
    }

}
