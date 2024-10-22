package patterns;

import java.util.Scanner;

public class newr {
    public static void main(String[]args){
        System.out.println("Enter two Variable values:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
