import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Marks");
        
        System.out.print("Maths\n");
        int maths = sc.nextInt();
        
        System.out.print("Biology\n");
        int bio = sc.nextInt();
        
        System.out.print("Physics\n");
        int phy = sc.nextInt();
        
        // Calculate total and percentage
        int totalMarks = maths + bio + phy;
        float percentage = (totalMarks * 100.0f) / 300.0f;
        
        // Calculate CGPA (on a 10-point scale)
        float cgpa = percentage / 10.0f;
        
        System.out.printf("Cgpa is : %.1f\n", cgpa);
        
        sc.close();
    }
}