public class Main {
    public static void main(String[] args) {
        String[][] myArray = new String[7][4];

        for (int i = 0; i < myArray.length; i++) {
            String separator = "*";
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == 0 || i == 3 || i == 6 || j == 0 || j == 3) {
                    myArray[i][j] = separator;
                    separator = "  *";
                } else {
                    myArray[i][j] = "   ";
                }
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }
}
