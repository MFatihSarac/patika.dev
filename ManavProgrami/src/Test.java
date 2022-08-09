import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5;

        System.out.print("Kaç kilo armut aldınız: ");
        double armut = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız: ");
        double elma = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız: ");
        double domates = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız: ");
        double muz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız: ");
        double patlican = input.nextDouble();

        double tutar = (armutKg * armut) + (elmaKg * elma) + (domatesKg * domates) + (muzKg * muz) + (patlicanKg * patlican);
        System.out.println("Aldıklarınız: " + armut + " kg armut, " + elma + " kg elma, " +
                domates + " kg domates, " + muz + " kg muz, " + patlican + " kg patlıcan!");
        System.out.println("Ödemeniz gereken tutar: " + tutar);
    }
}


