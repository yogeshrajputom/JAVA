

import java.util.Scanner;

public class counte {
    public static void main(String[] args) {
        System.out.println("Enter Your Digit:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
