package loops;

import java.util.Scanner;

public class reverceSum {
    public static void main(String[] args) {
        System.out.println("Enter Your Digit :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rever = 0;
        while (n > 0) {
            rever = rever * 10 + n % 10;
            n = n / 10;

        }
        System.out.println(rever);
    }

}
