import shapes.*;
import shapes.colors.Colors;

import java.util.ArrayList;

public class ListBuilder {
    private static final int MAX_ANGLE = 89;

    private ArrayList<Shape> shapes;

    public ListBuilder() {
        this.shapes = new ArrayList<Shape>();
    }

    public ArrayList<Shape> build() {
        buildSquares((int) (Math.random() * 10));
        buildTriangles((int) (Math.random() * 10));
        buildCircles((int) (Math.random() * 10));
        buildTrapezoids((int) (Math.random() * 10));
        return shapes;
    }

    private void buildSquares(int count) {
        for(int i = 0; i < count; i++) {
            shapes.add(new Square(Math.rint(Math.random() * 100) / 10, getColor()));
        }
    }

    private void buildTriangles(int count) {
        for(int i = 0; i < count; i++) {
            shapes.add(new RectangularTriangle(Math.rint(Math.random() * 100) / 10, (int) (Math.random() * MAX_ANGLE), getColor()));
        }
    }

    private void buildCircles(int count) {
        for(int i = 0; i < count; i++) {
            shapes.add(new Circle(Math.rint(Math.random() * 100) / 10, getColor()));
        }
    }

    private void buildTrapezoids(int count) {
        for(int i = 0; i < count; i++) {
            shapes.add(new Trapezoid(Math.rint(Math.random() * 100) / 10,
                    Math.rint(Math.random() * 100) / 10,Math.rint(Math.random() * 100) / 10, getColor()));
        }
    }

    private Colors getColor() {
        return Colors.values()[(int) (Math.random() * Colors.values().length)];
    }
}
