import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter a Value :");
        Scanner sc = new Scanner(System.in);
        int a ,sum=0;
        a = sc.nextInt();
        for(int i =1;i<=a;i++){
            sum=sum+i;  
        }
        System.out.println(sum);
                            // for(int i=1;i<=10;i++)
                            // for (int i = 10; i >= 1; i--) {

                            //     System.out.println(a + "X" + i + "=" + a * i);
        }
    }

}