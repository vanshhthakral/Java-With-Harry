public class Maximum {
     public static void main(String[] args) {
         
        int [] arr = {1,65,4,90,61,10};
        int max =0;
        for(int e:arr){
            if(e>max){
                max =e;
            
            }
        }
        System.out.println("The maximum element in the array is" +max);
         }
}
