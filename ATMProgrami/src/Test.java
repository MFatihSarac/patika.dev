import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hakSayisi = 3, islem;
        double bakiye = 1000;

        while (hakSayisi != 0) {
            System.out.print("Kullanıcı Adı: ");
            String userName = input.nextLine();
            System.out.print("Şifre: ");
            String password = input.nextLine();

            if (userName.equals("1") && password.equals("2")) {
                System.out.println("------------------\nGiriş başarılı!");
                do {
                    System.out.println("1-Para Yatır\n" +
                            "2-Para Çek\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    islem = input.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.print("Yatırılacak miktarı giriniz: ");
                            double yMiktar = input.nextDouble();
                            bakiye += yMiktar;
                            System.out.println(yMiktar + " TL hesabınıza yatırıldı. Güncel bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            double cMiktar = input.nextDouble();
                            if (cMiktar > bakiye) {
                                System.out.println("Hesabınızda yeterli para yok!");
                            } else {
                                bakiye -= cMiktar;
                                System.out.println("Hesabınızdan " + cMiktar + " TL çekildi. Güncel bakiyeniz: " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:

                            break;
                    }

                    if (islem > 4) {
                        System.out.println("---------------------------------\n" + "1, 2, 3 veya 4 değerini giriniz!");
                    }
                } while (islem != 4);

                System.out.println("Çıkış yaptınız!");
                break;
            } else {
                hakSayisi--;
                if (hakSayisi == 0) {
                    System.out.println("Hak sayınız doldu.");
                    break;
                } else {
                    System.out.println("Kullanıcı adı veya şifre yanlış!\nKalan Hak Sayısı: " + hakSayisi);
                }
            }
        }
    }
}

