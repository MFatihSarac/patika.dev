import java.util.Scanner;

public class Main {

    private static double calculateHarmonicMean(int[] arr) {
        double denominator = 0;

        for (int number : arr) {
            denominator += (1.0 / number);
        }
        return (arr.length / denominator);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int numberOfTerms = input.nextInt();
        int[] list = new int[numberOfTerms];

        System.out.print("Dizinin elemanlarını arada boşluk bırakarak giriniz: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println(calculateHarmonicMean(list));
    }
}
