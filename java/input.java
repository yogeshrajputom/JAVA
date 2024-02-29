import java.util.Scanner;

class input {
    public static void main(String args[]) {
        System.out.println("Enter Your name.");
        Scanner sc = new Scanner(System.in);
        String YourName = sc.nextLine();
        System.out.println(YourName);
        Scanner N = new Scanner(System.in);
        System.out.println("Enter a No. A");
    int a = N.nextInt();
        System.out.println("Enter a No. B");
        int b = N.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }

}
