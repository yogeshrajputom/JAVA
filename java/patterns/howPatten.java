package patterns;

public class howPatten {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }

            // Print numbers for the current row
            if (i < rows) {
                System.out.print(i);
                if (i > 1) {
                    // Print spaces between the numbers
                    for (int j = 1; j < (i - 1) * 2 + 1; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(i);
                }
            } else {
                // For the last row, print the number repeatedly
                for (int j = 1; j <= (i * 2 - 1); j++) {
                    System.out.print(i+" ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}