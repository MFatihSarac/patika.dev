import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        double matematikNot = input.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        double fizikNot = input.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        double kimyaNot = input.nextDouble();
        System.out.print("Türkçe notunuzu giriniz: ");
        double turkceNot = input.nextDouble();
        System.out.print("Tarih notunuzu giriniz: ");
        double tarihNot = input.nextDouble();
        System.out.print("Müzik notunuzu giriniz: ");
        double muzikNot = input.nextDouble();

        double ortalama = (matematikNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot) / 6;
        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println("SONUÇ: " + sonuc);
    }
}
