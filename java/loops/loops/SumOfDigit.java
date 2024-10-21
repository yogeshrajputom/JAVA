package java.loops.loops;


import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ente your Digite:");
        int dig = sc.nextInt();
        int SumOf = 0;

        while (dig > 0) {
            SumOf += dig % 10;
            dig = dig / 10;
        }
        System.out.println(+ SumOf);
    }
}
