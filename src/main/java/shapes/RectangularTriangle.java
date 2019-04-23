package shapes;

import shapes.colors.Colors;

public class RectangularTriangle extends Shape {
    private final static String NAME = "rectangular triangle";
    private final static String MEASURING_ITEM = "hypotenuse";

    private int angle;

    public RectangularTriangle(double measureItem, int angle, Colors color) {
        this.name = NAME;
        this.measuringItemValue = measureItem;
        this.angle = angle;
        this.color = color;
    }

    public double getArea() {
        return Math.rint(.5 * measuringItemValue * measuringItemValue * Math.cos(Math.toRadians(angle)) * Math.sin(Math.toRadians(angle)) * 100000) / 100000;
    }

    String getMeasuringItem() {
        return MEASURING_ITEM + ": " + measuringItemValue + ", angle: " + angle;
    }
}