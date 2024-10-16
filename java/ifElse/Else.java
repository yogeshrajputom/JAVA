import java.util.scanner;
package ifElse;

public class Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Enter Four No. ");
        int a,b,c,d= sc.nextInt();
        System.out.println("Your No is:");
        if(a>b){
            System.out.println("a is bigger then b");
            if(a>c){
                System.out.println("a is bigger then c");
                if(a>d){
                    System.out.println("a is bigger then  d")
                }else{
                    System.out.println("d is bigger than a");
                    System.out.println("d is largest "+d);
                }
            }  else{
                System.out.println("c is bigger then a");
                System.out.println("c is largst"+c);
            }
        }esle{
            System.out.println("b is bigger then a");
            System.out.println("b is largste "+b);
        
    }

}
