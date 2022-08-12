import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int toplam = 0, adet = 0;

        System.out.print("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();

        for (int i = 0; i <= sayi; i += 12) {
            if (i == 0) {
                continue;
            }
            if (i % 12 == 0) {
                toplam += i;
                adet += 1;
            }
        }
        int ortalama = toplam / adet;
        System.out.println("0-" + sayi + " arasındaki sayılardan 3 ve 4'e bölünenlerin ortalaması: " + ortalama);
    }
}
