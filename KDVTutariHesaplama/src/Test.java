import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ürününüzün KDV'siz Fiyatını Giriniz: ");
        double kdvsizFiyat = input.nextDouble();

        boolean karsilastir = 0 < kdvsizFiyat && kdvsizFiyat <= 1000;

        double kdvliFiyat = karsilastir ? kdvsizFiyat * 1.18 : kdvsizFiyat * 1.08;
        double kdvTutar = kdvliFiyat - kdvsizFiyat;

        System.out.println("Ürünün KDV'li Fiyatı: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutar);
    }
}



