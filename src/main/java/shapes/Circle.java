package shapes;

import shapes.colors.Colors;

import static tools.FixMeasureOfInaccuracy.fixInaccuracy;

public class Circle extends Shape {
    private final static String NAME = "circle";
    private final static String RADIUS = "radius";

    private double radius;

    public Circle(double radius, Colors color) {
        this.name = NAME;
        this.color = color;
        if(radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getArea() {
        return fixInaccuracy(radius * radius * Math.PI);
    }

    void drawMeasuringItems() {
        System.out.print(RADIUS + ": " + radius);
    }
}
