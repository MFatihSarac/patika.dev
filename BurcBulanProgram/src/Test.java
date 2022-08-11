import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String burc = "";
        boolean gunHata = false;
        boolean ayHata = false;

        System.out.print("Doğduğunuz ayı harflerle yazınız: ");
        String ay = input.nextLine();
        System.out.print("Doğduğunuz günü giriniz (1-31): ");
        int gun = input.nextInt();

        if (ay.equals("Ocak") || ay.equals("ocak") || ay.equals("OCAK")) {
            if (gun >= 1 && gun <= 21) {
                burc = "Oğlak";
            } else if (gun > 21 && gun <= 31) {
                burc = "Kova";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Şubat") || ay.equals("şubat") || ay.equals("ŞUBAT")) {
            if (gun >= 1 && gun <= 19) {
                burc = "Kova";
            } else if (gun > 19 && gun <= 28) {
                burc = "Balık";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Mart") || ay.equals("mart") || ay.equals("MART")) {
            if (gun >= 1 && gun <= 20) {
                burc = "Balık";
            } else if (gun > 20 && gun <= 31) {
                burc = "Koç";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Nisan") || ay.equals("nisan") || ay.equals("NİSAN")) {
            if (gun >= 1 && gun <= 20) {
                burc = "Koç";
            } else if (gun > 20 && gun <= 30) {
                burc = "Boğa";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Mayıs") || ay.equals("mayıs") || ay.equals("MAYIS")) {
            if (gun >= 1 && gun <= 21) {
                burc = "Boğa";
            } else if (gun > 21 && gun <= 31) {
                burc = "İkizler";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Haziran") || ay.equals("haziran") || ay.equals("HAZİRAN")) {
            if (gun >= 1 && gun <= 22) {
                burc = "İkizler";
            } else if (gun > 22 && gun <= 30) {
                burc = "Yengeç";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Temmuz") || ay.equals("temmuz") || ay.equals("TEMMUZ")) {
            if (gun >= 1 && gun <= 22) {
                burc = "Yengeç";
            } else if (gun > 22 && gun <= 31) {
                burc = "Aslan";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Ağustos") || ay.equals("ağustos") || ay.equals("AĞUSTOS")) {
            if (gun >= 1 && gun <= 22) {
                burc = "Aslan";
            } else if (gun > 22 && gun <= 31) {
                burc = "Başak";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Eylül") || ay.equals("eylül") || ay.equals("EYLÜL")) {
            if (gun >= 1 && gun <= 22) {
                burc = "Başak";
            } else if (gun > 22 && gun <= 30) {
                burc = "Terazi";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Ekim") || ay.equals("ekim") || ay.equals("EKİM")) {
            if (gun >= 1 && gun <= 22) {
                burc = "Terazi";
            } else if (gun > 22 && gun <= 31) {
                burc = "Akrep";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Kasım") || ay.equals("kasım") || ay.equals("KASIM")) {
            if (gun >= 1 && gun <= 21) {
                burc = "Akrep";
            } else if (gun > 21 && gun <= 30) {
                burc = "Yay";
            } else {
                gunHata = true;
            }
        } else if (ay.equals("Aralık") || ay.equals("aralık") || ay.equals("ARALIK")) {
            if (gun >= 1 && gun <= 21) {
                burc = "Yay";
            } else if (gun > 21 && gun <= 31) {
                burc = "Oğlak";
            } else {
                gunHata = true;
            }
        } else {
            ayHata = true;
        }

        if (gun < 1 || gun > 31) {
            gunHata = true;
        }

        if (gunHata && ayHata) {
            System.out.println("Hatalı ay ve gün girdiniz!");
        } else if (gunHata) {
            System.out.println("Hatalı gün girdiniz!");
        } else if (ayHata) {
            System.out.println("Hatalı ay girdiniz!");
        } else {
            System.out.println(burc + " burcusunuz!");
        }
    }
}
