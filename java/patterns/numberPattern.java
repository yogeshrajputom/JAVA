package patterns;

import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

}
