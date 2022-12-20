public class Main {
    public static void main(String[] args) {
        String separator = "";

        int[][] matrix = new int[(int) (2 + Math.random() * 9)][(int) (2 + Math.random() * 9)];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (1 + Math.random() * 99);
            }
        }

        System.out.println("Matris:");
        for (int i = 0; i < matrix.length; i++) {
            separator = "";
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(separator + matrix[i][k]);
                separator = "\t";
            }
            System.out.println("");
        }

        System.out.println("\nTranspozu:");
        for (int i = 0; i < matrix[0].length; i++) {
            separator = "";
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(separator + matrix[j][i]);
                separator = "\t";
            }
            System.out.println();
        }
    }
}
