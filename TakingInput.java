
import  java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking User Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a =sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b =sc.nextInt();
        
        int sum = a + b;
        System.out.println("Sum oF these Numbers : " + sum );

        sc.close();
    }
}
