import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = input.nextDouble();

        System.out.println("----------------------------");
        System.out.print("Toplama işlemi için 1\nÇıkarma işlemi için 2\n" +
                "Çarpma işlemi için 3\nBölme işlemi için 4 yazınız: ");
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez!");
                } else {
                    System.out.println("Sonuç: " + (sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz!");
                break;
        }
    }
}
