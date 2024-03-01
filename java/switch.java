import java.util.Scanner;

class swit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Col = sc.nextInt();
        switch (Col) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Go");
                break;
            case 3:
                System.out.println("Radey");
                break;
            default:
                System.out.println("Go");
        }
    }
}
