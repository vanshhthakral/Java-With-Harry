

import java.util.Scanner;


public class Marks {
    public static void main(String[] args) {
        
        System.out.println("Enter your marks out of  100");
        System.out.println("Mathematics");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Hindi");
        float b = sc.nextFloat();
        System.out.println("English");
        float c = sc.nextFloat();
    


        float Percentage =  (a+ b+ c)/3;
        System.out.println("Your Percentage is :" +Percentage );

        if (Percentage>40 && a >33 && b>33 && c>33){
           
            System.out.println("You are pass");
        }
        else {
            System.out.println("You are fail");
        }
        
    }
}
