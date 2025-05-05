
public class Recursivesum {

    static int sum(int a){
        if (a == 1) {
            return 1; 
        } else {
            return a + sum(a - 1); 
        }
    }
    public static void main(String[] args) {
        sum(7);
        System.out.println("The sum of first 7 natural numbers is: " + sum(7));
    }
}
