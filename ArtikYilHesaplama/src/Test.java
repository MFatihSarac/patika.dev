import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean artikYilMi = false;

        System.out.print("Bir yıl giriniz: ");
        int yil = input.nextInt();

        if (yil % 4 == 0) {
            artikYilMi = true;
            if (yil % 100 == 0) {
                if (yil % 400 != 0) {
                    artikYilMi = false;
                }
            }
        }

        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir!");
        }
    }
}
