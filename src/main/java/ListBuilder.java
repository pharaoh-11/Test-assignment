import shapes.*;
import shapes.colors.Colors;

import java.util.ArrayList;

import static tools.FixMeasureOfInaccuracy.fixInaccuracy;

public class ListBuilder {
    private static final int MAX_ANGLE = 88;

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
            shapes.add(new Square(newLeg(), newColor()));
        }
    }

    private void buildTriangles(int count) {
        for(int i = 0; i < count; i++) {
            shapes.add(new RectangularTriangle(newLeg(), (int) (Math.random() * MAX_ANGLE + 1), newColor()));
        }
    }

    private void buildCircles(int count) {
        for(int i = 0; i < count; i++) {
            shapes.add(new Circle(newLeg(), newColor()));
        }
    }

    private void buildTrapezoids(int count) {
        for(int i = 0; i < count; i++) {
            shapes.add(new Trapezoid(newLeg(), newLeg(),newLeg(), newColor()));
        }
    }

    private Colors newColor() {
        return Colors.values()[(int) (Math.random() * Colors.values().length)];
    }

    private double newLeg() {
        return fixInaccuracy(Math.rint(Math.random() * 100) / 10 + 0.1);
    }
}
