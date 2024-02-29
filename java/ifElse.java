import java.util.Scanner;
import java.util.concurrent.StructuredTaskScope.ShutdownOnFailure;

class ifElse {
    public static void main(String args[]) {
        System.out.println("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if (Age >= 18) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are Childe");
        }

        // odd & even No
        System.out.println("Enter any Number:");
        Scanner s = new Scanner(System.in);
        float no = s.nextFloat();
        if (no % 2 == 0) {
            System.out.println("Number is even:");

        } else {
            System.out.println("Number is odd:");
        }

        // a=b, a>b, a<b
        Scanner N = new Scanner(System.in);
        System.out.println("Enter no First");
        int FirstA = N.nextInt();
        System.out.println("Enter no Second");
        int SecondB = N.nextInt();
        if (FirstA == SecondB) {
            System.out.println("Number are Same");
        } else {
            if (FirstA > SecondB) {
                System.out.println("First A ia Gretar ");
            } else {
                System.out.println("First A is lessthen Second B");
            }

        }
    }
}
