import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dersSayisi = 5;

        System.out.print("Matematik notunuzu girin: ");
        double matematik = input.nextDouble();
        System.out.print("Fizik notunuzu girin: ");
        double fizik = input.nextDouble();
        System.out.print("Türkçe notunuzu girin: ");
        double turkce = input.nextDouble();
        System.out.print("Kimya notunuzu girin: ");
        double kimya = input.nextDouble();
        System.out.print("Müzik notunuzu girin: ");
        double muzik = input.nextDouble();

        double toplam = (matematik + fizik + turkce + kimya + muzik);

        if (matematik < 0 || matematik > 100) {
            toplam -= matematik;
            dersSayisi -= 1;
        }
        if (fizik < 0 || fizik > 100) {
            toplam -= fizik;
            dersSayisi -= 1;
        }
        if (turkce < 0 || turkce > 100) {
            toplam -= turkce;
            dersSayisi -= 1;
        }
        if (kimya < 0 || kimya > 100) {
            toplam -= kimya;
            dersSayisi -= 1;
        }
        if (muzik < 0 || muzik > 100) {
            toplam -= muzik;
            dersSayisi -= 1;
        }

        double ortalama = toplam / dersSayisi;

        if (ortalama >= 55) {
            System.out.println(ortalama + " ortalamayla sınıfı geçtiniz!");
        } else {
            System.out.println(ortalama + " ortalamayla sınıfta kaldınız!");
        }
    }
}
