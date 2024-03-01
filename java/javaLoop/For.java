package javaLoop;

import java.util.Scanner;

public class For {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NO.");
        int a = sc.nextInt();
        int b;
        for (int i = 1; i <=10 ; i++) {
            b = a * i;
            System.out.println(b);
        }
    }

}
