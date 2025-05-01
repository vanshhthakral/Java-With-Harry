public class Precendence_Associativity {
    public static void main(String[] args) {
        
        //Precendence & Associativity
        int l = 60*5-34/2;
        /*
         =300-34/2
         =300-17
         =283
         */
        /*
         Highest Precendence goes to * and / They re then evualated on the basis of left to right associativity
        */

        int m = 60/5-34*2;
         /*
         =12-34*2
         =12-68
         =-56
         */


        System.out.println(l);
        System.out.println(m);

       // Quick Quiz Discriminant Formula
       int a = 1;
       int b = 6;
       int c = 5;
       int k =( b*b - 4*a*c)/2*a;
       System.out.println(k);
    }
}
