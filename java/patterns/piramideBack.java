package patterns;

import java.util.Scanner;

public class piramideBack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {                  /*for(int i=a;i>=1;i--)
                                                         for(int j=1;j<=i;j++)  } */
            for (int j = 1; j <=(a+1-i); j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
