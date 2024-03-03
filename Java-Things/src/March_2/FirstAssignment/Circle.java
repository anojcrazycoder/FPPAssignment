package March_2.FirstAssignment;

public class Circle extends Shape {

    protected  double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    @Override
   protected double calculateArea(){
        return Math.PI * radius * radius;
    }

  protected   double calculatePerimeter(){
       return 2* Math.PI*radius;
    }
}
