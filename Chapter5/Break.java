package Chapter5;

public class Break {
    public static void main(String[] args) {
        //Break and continue using loops
        for(int i=0; i<=5; i++){
                System.err.println(i);
                System.err.println("Java is great"); 
            if(i==5){
                System.err.println("ENDING THE LOOP"); 
                break;
            } 
        }
        for(int a=0; a<=5; a++){
            
        if(a==2){
            System.err.println("ENDING THE LOOP"); 
            continue;
            } 
        System.err.println(a);
        System.err.println("Java is great");
        }
    }
}
