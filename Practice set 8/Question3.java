class Square{
 int side;
    public int area(){
      int area ;
      area =side*side;
      return area;

    
    }
    public int perimeter(){
        int peri ;
        peri =4*side;
        return peri;
      
      }
}
public class Question3 {
    public static void main(String[] args) {
        
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
