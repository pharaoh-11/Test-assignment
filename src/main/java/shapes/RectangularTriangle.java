package shapes;

import shapes.colors.Colors;

import static tools.FixMeasureOfInaccuracy.fixInaccuracy;

public class RectangularTriangle extends Shape {
    private static final int MAX_ANGLE = 89;
    private final static String NAME = "rectangular triangle";
    private final static String HYPOTENUSE = "hypotenuse";
    private final static String ANGLE = "angle";

    private int angle;
    private double hypotenuse;

    public RectangularTriangle(double hypotenuse, int angle, Colors color) {
        this.name = NAME;
        this.color = color;
        if(hypotenuse > 0 && angle >= 0 && angle <= MAX_ANGLE) {
            this.hypotenuse = hypotenuse;
            this.angle = angle;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getArea() {
        return fixInaccuracy(.5 * hypotenuse * hypotenuse * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(angle)));
    }

    void drawMeasuringItems() {
        System.out.print(HYPOTENUSE + ": " + hypotenuse + ", " +
                ANGLE + ": " + angle);
    }
}