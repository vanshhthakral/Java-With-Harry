public class Sorted {
    public static void main(String[] args) {
    int [] arr = {18,65,4,90,61,10};
    boolean isSorted = true;
    int l =arr.length;

    for(int i =0; i<l; i++)
    {
        if(arr[i] > arr[i+1]){
            isSorted = false;
            break;
        }
    
    }
   if(isSorted){
    System.out.println("The array is sorted");
   }
   else{
    System.out.println("The array is not sorted");
   }
    
  }
}
