import java.util.Scanner;
public class Leap
{
    public static void main(String[] args)
    {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year 'y' to be checked:");
        y = sc.nextInt();
        int year = ((y%4==0&&y%100!=0)||(y%400==0))?1:0;
        if(year==1)
        {
            System.out.print("y is a leap year");
        }
        else
        {
            System.out.print("y is not a leap year");
        }
    }
}