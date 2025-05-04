package Chapter6;

public class Array {
    public static void main(String[] args) {
        int [] marks = new int[5];  //Declaration and memory allocation

        int [] mark ;      // Declaration
        mark = new int[5];   // Mmemory allocation

        int [] marks2 ={67,89,78,90};   //declaration and initilaization all together
        marks[0]=100;
        marks[1]=90;
        marks[2]=86;
        marks[4]=67;
        System.out.println(marks[2]); //Priniting using naive method
        System.out.println(mark[3]);
        System.out.println(marks2[2]);
        System.out.println(marks.length);  // tells the size of array

        for(int i = 0; i<marks.length; i++)  //Displaying the array using for loop
        {
            System.out.println(marks[i]);
        }
        for(int i = marks.length-1 ; i>=0; i--)  //Displaying the array using for loop in reverse order
        {
            System.out.println(marks[i]);
        }
    }
}

