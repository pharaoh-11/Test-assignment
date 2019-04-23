package shapes;

import shapes.colors.Colors;

public class Trapezoid extends Shape {
    private final static String NAME = "trapezoid";
    private final static String MEASURING_ITEM = "radius";

    private double topBase;
    private double bottomBase;
    private double height;

    public Trapezoid(double topBase, double bottomBase, double height, Colors color) {
        this.name = NAME;
        this.topBase = topBase > 0 ? topBase : 0;
        this.bottomBase = bottomBase > 0 ? bottomBase : 0;
        this.height = height > 0 ? height : 0;
        this.color = color;
    }

    public double getArea() {
        return (topBase + bottomBase) * 0.5 * height;
    }

    String getMeasuringItem() {
        return null;
    }
}
