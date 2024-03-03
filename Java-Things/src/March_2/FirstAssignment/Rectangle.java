package March_2.FirstAssignment;

public class Rectangle extends Shape {
    protected  double width;
    protected  double height;

    public  Rectangle(String color,double width,double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculateArea(){
        return this.height*width;
    }

    @Override
    protected double calculatePerimeter(){
        return 2*(width+height);
    }
}
