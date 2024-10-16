import java.util.Scanner;
package Sparse;

public class SparseMatrix {
    public static void main(String[] args) {
        int i, j, Z = 0, nz = 0;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (i = 0; i < arr.length; i++)
            for (j = 0; j < arr.length; j++) {
                System.out.println("Enter Your No.");
                arr[i][j] = sc.nextInt();
            }
        System.out.println("The matrix is:");
        for (i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        for (i = 0; i < arr.length; i++)
            for (j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    Z++;
                } else {
                    nz++;
                }
            }else(nz>arr.length)
                Systme.out.println("Note Sparse Matrix");

    }
}
