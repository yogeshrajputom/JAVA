public class max {
    
    public static void main(String[] args) {
        int arra[]={54,75,14,25,65,35,26,98,5425,75,63,856,895,324,};
        int max= Integer.MIN_VALUE;
        for(int arr:arra){
            if(arr>max){
                max=arr;
            }
        }
        System.out.println(max);
    }
}
