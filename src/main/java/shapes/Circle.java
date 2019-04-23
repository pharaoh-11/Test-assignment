package shapes;

import shapes.colors.Colors;

public class Circle extends Shape {
    private final static String NAME = "circle";
    private final static String RADIUS = "radius";

    private double radius;

    public Circle(double radius, Colors color) {
        this.name = NAME;
        this.color = color;
        this.radius = radius > 0 ? radius : 0;
    }

    public double getArea() {
        return Math.rint(radius * radius * Math.PI * 10000) / 10000;
    }

    void drawMeasuringItems() {
        System.out.print(RADIUS + ": " + radius);
    }
}
