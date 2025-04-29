import java.util.Scanner;

public class Cgpaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Marks out of 50:");
        
        System.out.print("Maths\n");
        int maths = sc.nextInt();
        
        System.out.print("Biology\n");
        int bio = sc.nextInt();
        
        System.out.print("Physics\n");
        int phy = sc.nextInt();

        if(maths>50 || phy>50 || bio>50)
        {
            System.out.println("Please enter marks out of 50");
        }
        else{
            double total, percentage,cgpa;
            total=(maths+ phy+ bio);
            percentage = (total/150 )* 100;
            cgpa= percentage/9.6;
            System.out.println("Total marks: " + total);
            System.out.println("Percentage: " + percentage);
            System.out.printf("CGPA: %.2f ", cgpa);

        }


        
        sc.close();
    }
}