public class mini {
    public static void main(String[] args) {
        int arr[] = { 25, 83, 54, 75, 21, 15, 46, 10, 85, 21 };
        int min = Integer.MAX_VALUE;
        for(int ar:arr){
            if(ar<min){
                min=ar;
            }
        }
    
        System.out.println(min);
    }

}
