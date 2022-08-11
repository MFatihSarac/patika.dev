import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarife = 0.10;

        System.out.print("Gideceğiniz mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.nextLine();
        System.out.print("Yolculuk tipini seçiniz (Tek Yön => 1; Gidiş Dönüş => 2): ");
        String tip = input.nextLine();

        double fiyat = (mesafe * tarife);
        double yasIndirimli = fiyat, tipIndirimli = fiyat;

        if ((mesafe > 0) && (yas > 0) && (tip.equals("1") || tip.equals("2"))) {
            if (yas < 12) {
                yasIndirimli = (fiyat * 0.5);
                if (tip.equals("2")) {
                    tipIndirimli = (yasIndirimli * 0.8);
                    fiyat = 2 * tipIndirimli;
                } else {
                    fiyat = yasIndirimli;
                }
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimli = (fiyat * 0.9);
                if (tip.equals("2")) {
                    tipIndirimli = (yasIndirimli * 0.8);
                    fiyat = 2 * tipIndirimli;
                } else {
                    fiyat = yasIndirimli;
                }
            } else if (yas > 65) {
                yasIndirimli = (fiyat * 0.7);
                if (tip.equals("2")) {
                    tipIndirimli = (yasIndirimli * 0.8);
                    fiyat = 2 * tipIndirimli;
                } else {
                    fiyat = yasIndirimli;
                }
            }
            System.out.println("Toplam Tutar: " + fiyat + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
