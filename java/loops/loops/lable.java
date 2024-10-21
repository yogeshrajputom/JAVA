public class lable {
    public static void main(String[]args){
        myloop:for(int i=1;i<=60;i++){
            if(i%5==0){
                break myloop;
            }
            System.out.println(i);
        }

    }
    
}
// lable are use in nexted loop mostley