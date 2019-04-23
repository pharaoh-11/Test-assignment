import shapes.*;
import shapes.colors.Colors;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(2, Colors.YELLOW));
        shapes.add(new Square(3, Colors.YELLOW));
        shapes.add(new Trapezoid(4, 5, 3, Colors.YELLOW));
        shapes.add(new RectangularTriangle(6, 80, Colors.YELLOW));

        for(Shape shape : shapes) {
            shape.draw();
            System.out.println();
        }
    }
}
