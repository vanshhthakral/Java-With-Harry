
public class Reverse {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        for(int i =0; i<n; i++){

            //swap a[i] to a[l-1-i]
            int  temp = arr[i];
             arr[i] = arr[l-1-i];  
             arr[l-1-i] = temp;
            }
            for(int element: arr){
                System.out.println(element);
            }
            
    }
    
}
