package shapes;

import shapes.colors.Colors;

import static tools.FixMeasureOfInaccuracy.fixInaccuracy;

public class Trapezoid extends Shape {
    private final static String NAME = "trapezoid";
    private final static String TOP_BASE = "top base";
    private final static String BOTTOM_BASE = "bottom base";
    private final static String HEIGHT = "height";

    private double topBase;
    private double bottomBase;
    private double height;

    public Trapezoid(double topBase, double bottomBase, double height, Colors color) {
        this.name = NAME;
        this.color = color;
        if(topBase > 0 && bottomBase > 0 && height > 0) {
            this.topBase = topBase;
            this.bottomBase = bottomBase;
            this.height = height;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getArea() {
        return fixInaccuracy((topBase + bottomBase) * 0.5 * height);
    }

    void drawMeasuringItems() {
        System.out.print(TOP_BASE + ": " + topBase + ", " +
                BOTTOM_BASE + ": " + bottomBase + ", " +
                HEIGHT + ": " + height);
    }
}
