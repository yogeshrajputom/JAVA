import java.util.Scanner;

public class Calcul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A");
        int a = sc.nextInt();
        System.out.println("Enter Value of B");
        int b = sc.nextInt();
        System.out.println("Enter an  Operator do Your wnat Calculate (+,-,*,/,%)");
        char Op = sc.next().charAt(0);
        switch (Op) {
            case '+':
                System.out.println(a + b);

                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invelide Operator");
                break;
        }

    }

}
