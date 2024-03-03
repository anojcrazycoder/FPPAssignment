package March_2.FirstAssignment;

public class Main {

    public  static  void main(String[] args){
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle("Red",4.0,5.0);
        shapes[2] = new Circle("Blue",3);
        shapes[3] = new Square("Green",4.0);

        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
