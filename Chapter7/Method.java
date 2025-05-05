
public class Method {

    static int logic(int x , int y){
        int c ;
        if (x>y){
            c = 2*x+y;
        }
        else{
            c = x+y;  
        }

        return c;
    }
    public static void main(String[] args) {

        //Why to repeat same thing and create unneccesaary cluter
        
        int a = 1;
        int b = 3;
        int c ;

        c = logic(a, b);

        int a1 =16;
        int b1 = 3;
        int c1 ;

        c1= logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
