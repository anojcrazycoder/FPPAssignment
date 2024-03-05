package March_4.FirstAssignment;

public class Driver {
    public static void main(String[] args) {
// Applying polymorphism to create an array of Figure type
        Figure[] figures = { new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical() };

        // Output without class names
        for (Figure figure : figures) {
            figure.getFigure();
        }

        System.out.println(); // newline

        // Output with class names
        for (Figure figure : figures) {
            System.out.print(figure.getClass().getSimpleName() + " : ");
            figure.getFigure();
            System.out.println();
        }

    }
}
