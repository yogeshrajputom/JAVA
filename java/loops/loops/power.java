package loops;

import java.util.Scanner;

public class power {
    public static void main(String[] args0) {
        System.out.println("Ente A and B two No.:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        System.out.println(ans);
    }

}
