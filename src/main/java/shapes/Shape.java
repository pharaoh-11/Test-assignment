package shapes;

import shapes.colors.Colors;

public abstract class Shape {
    String name;
    Colors color;

    public abstract double getArea();
    abstract void drawMeasuringItems();

    void drawName() {
        System.out.print("Figure: " + name);
    }
//
//    String getColor() {
//        return color.getColor();
//    }

    private void drawArea() {
        System.out.print("area: " + getArea());
    }

    private void drawColor() {
        System.out.print("color: " + color.getColor());
    }

    public void draw() {
        drawName();
        System.out.print(", ");
        drawArea();
        System.out.print(", ");
        drawMeasuringItems();
        System.out.print(", ");
        drawColor();
    }
}
