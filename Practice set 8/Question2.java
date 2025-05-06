class Cellphone{

    String name ;
    
    public void Ringing(){
        System.out.println("Ringing...");
    }
    public void Calling(){
        System.out.println("Calling...");
    }
}


public class Question2 {
    public static void main(String[] args) {
        Cellphone vivo = new Cellphone();
        vivo.Ringing();
        vivo.Calling();
    }
    
}
