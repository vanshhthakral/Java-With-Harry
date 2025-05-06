
class Cylinder{
    private int radius;
    private int  height;

    public int getRadius(){
        return radius;

    }

    public int getHeight(){
        return height;

    }

    public void setRadius(int radius){
        this.radius= radius;

    }

    public void setHeight(int height){
      this.height= height;

    }
   public int Area(){
     double area = 2*radius*Math.PI*radius +2*Math.PI*radius*height;
    return(int) area;
   }

    public int Vol(){
        double Vol = Math.PI*radius*radius*height;
       return(int) Vol;
   }
}



public class Question1 {

    public static void main(String[] args) {
        Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(12);
        mycylinder.setRadius(4);
        int h =mycylinder.getHeight();
        int r =mycylinder.getRadius();
        double area =mycylinder.Area();
        double vol = mycylinder.Vol();
        System.out.println("The height of cylinder is " +h);
        System.out.println("The radius of cylinder is " +r);
        System.out.println("The area of cylinder is " + area);
        System.out.println("The Vol of cylinder is " + vol);
    }
}