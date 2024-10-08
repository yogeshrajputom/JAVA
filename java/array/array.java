public class array {
    public static void main(String[] args) {
        
        int arg[]; //declaration

        arg=new int[5];  //allocation
        
            //  int arg[]=new int[5]   one line array declaration
        arg[0]=6;
        arg[1]=3;
        arg[2]=6;
        arg[3]=8;
        arg[4]=6;
        System.out.println(arg[0]);
        System.out.println(arg[1]);
        System.out.println(arg[2]);
        System.out.println(arg[3]);
        System.out.println(arg[4]);
        System.out.println(arg.length);

             // use the for loop print array

        int marks[]={54,62,58,67,52};
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        for(int i=0; i<=marks.length;i++){
        System.out.println(marks[i]);
        }

        //For each loop 

        for(int mark:marks){
            System.out.println(mark);
        }


    }
    
}
