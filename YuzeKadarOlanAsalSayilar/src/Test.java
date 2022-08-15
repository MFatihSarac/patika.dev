public class Test {
    public static void main(String[] args) {
        boolean isPrime = false;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }

            if (i == 2) {
                System.out.print(i + " ");
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
