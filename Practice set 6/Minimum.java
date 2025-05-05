public class Minimum {
    public static void main(String[] args) {
        
       int [] arr = {18,65,4,90,61,10};
       int min =arr[0];
       for(int e:arr){
           if(e<min){
               min =e;
           
           }
       }
       System.out.println("The mainimum element in the array is   "    +min);
        }
}
