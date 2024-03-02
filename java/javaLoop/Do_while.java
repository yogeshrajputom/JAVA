import java.util.Scanner;

public class Do_while {
    public static void main(String args[]) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        do {
            i = i + 1;
            int tab;
            tab = a * i;
            System.out.println(tab);
        } while (i <= 10);
    }
}
