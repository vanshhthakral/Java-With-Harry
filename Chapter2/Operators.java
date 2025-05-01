package Chapter2;
public class Operators {
    public static void main(String[] args) {
        //Arithematic Operators

        int a = 4;
        
        int b =  6 % a;  // Modulo operator
        //Assignment Operators
        b+=3;
        System.out.println(b);
        
        //Comparison Operators
        System.out.println(b>7);


        //Logical operators
        System.out.println(b==5);
        //and operator both the entities shouldd be true
        System.out.println(b==5 && b==6);
        //or operator one can be true one can be false
        System.out.println(b==5 || b==6);

        //Bitwise operator
        System.out.println(2&3);


    }
    
}
