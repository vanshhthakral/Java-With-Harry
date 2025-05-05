

public class Varaggs {
     static int sum(int ...arr){
        int result = 0;
        for(int a:arr){
            result += a;

        }
        return result;

     }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 7 is " +sum(4 , 5));
        System.out.println("The sum of no s is " +sum(4 , 5 ,8 ,9 ,2 ,4 ,9 ,-23));
    }
    
}
