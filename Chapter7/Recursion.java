
public class Recursion {

   static int factorial(int n){
        if( n == 0 || n ==1){
            return 1;
        }
        else{
             return  n * factorial(n-1);  // Recalling the function termed as recursion
        }
    }
    public static void main(String[] args) {
    
        System.err.println(factorial(4));
    }
    
}
