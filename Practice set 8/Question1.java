class Employee{
   int salary;
   String name;


   public int getSalary() {
    return salary;
   }

   public String getName(){
    return name;
   }

   public void setName(String n){
    name= n;
   }


}

public class Question1{

    public static void main(String[] args) {
        Employee Vansh = new Employee();
        Vansh.setName("Vansh Thakral");
        Vansh.getName();
        Vansh.salary= 78;
        System.out.println(Vansh.getName());
        System.out.println(Vansh.getSalary());
    }
}