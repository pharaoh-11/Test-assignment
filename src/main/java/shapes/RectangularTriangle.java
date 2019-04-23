package shapes;

import shapes.colors.Colors;

public class RectangularTriangle extends Shape {
    private final static String NAME = "rectangular triangle";
    private final static String HYPOTENUSE = "hypotenuse";
    private final static String ANGLE = "angle";

    private int angle;
    private double hypotenuse;

    public RectangularTriangle(double hypotenuse, int angle, Colors color) {
        this.name = NAME;
        this.color = color;
        this.hypotenuse = hypotenuse > 0 ? hypotenuse : 0;
        this.angle = angle >= 0 && angle <= 90 ? angle : 0;
    }

    public double getArea() {
        return Math.rint(.5 * hypotenuse * hypotenuse * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(angle)) * 100000) / 100000;
    }

    void drawMeasuringItems() {
        System.out.print(HYPOTENUSE + ": " + hypotenuse + ", " +
                ANGLE + ": " + angle);
    }
}