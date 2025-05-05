

public class Methodoverloading {
    static void foo(){
        System.out.println(" Good morning bro!");
    }
    static void foo(String a){
        System.out.println(" Good morning " + a + " bro!");
    }
    public static void main(String[] args) {
        foo();
        foo("Vansh");
    }
}
