package Chapter3;

public class Strings {
    public static void main(String[] args) {
        String name = new String("Harry");
        System.out.println(name);
        // Scanner sc = new Scanner(System.in);
        // String st = sc.nextLine();
        // System.out.println(st);
        int value = name.length();
        System.out.println(value);
        // To lower case
        String lString = name.toLowerCase();
        System.out.println(lString);
        // To uppercase
        String uString = name.toUpperCase();
        System.out.println(uString);


    }
    
}
