public class Contenu {
    public static void main(String []args){
        int i=1;
        while(i<=50){
            if (i%3==0){
                i++;     
                continue;
            }
            System.out.println(i);
            i++;
        }

    }

}