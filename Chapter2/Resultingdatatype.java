// package Chapter2;
public class Resultingdatatype {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        int a = x + y;
        float b = 6.54f + x;
        System.out.println(b );
        System.out.println(a );

        //Increment and decrement operators
            int i = 56;
            int d = i++ ;  // first b is assigned i then i is incremented
            int j = 67;
            int c = ++j; // first j is incremented then c is assigned 
            System.out.println(c ); // 67+1 = 68
            System.out.println(d);  // 56 remaines then i = 57

            System.out.println(i++ ); // 57
            System.out.println(i);  // 58
            System.out.println(++i ); //59
            System.out.println(i ); //59

            // Quik Quiz

        int l = 5;
        int s = 7;
        int k = (++l)*(s++)- 3*++s;
        System.out.println(k);
    }
} 
