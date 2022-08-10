import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi = "patika", kullaniciSifre = "Java123";

        System.out.print("Kullanıcı adınız: ");
        String kAdi = input.nextLine();
        System.out.print("Şifreniz: ");
        String kSifre = input.nextLine();

        if (kAdi.equals(kullaniciAdi) && kSifre.equals(kullaniciSifre)) {
            System.out.println("Hesabınıza giriş yaptınız!");
        } else {
            System.out.println("Kullanıcı adınız veya şifreniz hatalı!");
            System.out.print("Şifrenizi sıfırlamak istiyorsanız 'E' istemiyorsanız 'H' yazınız: ");
            String sifirlama = input.nextLine();
            switch (sifirlama) {
                case "E":
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String yeniSifre = input.nextLine();

                    if (yeniSifre.equals(kSifre) || yeniSifre.equals(kullaniciSifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                    } else {
                        System.out.println("Yeni şifre başarıyla oluşturuldu!");
                    }
                    break;
                case "H":
                    System.out.println("Çıkış yaptınız.");
                    break;
                default:
                    System.out.println("Geçersiz bir karakter girdiniz!");
            }
        }
    }
}
