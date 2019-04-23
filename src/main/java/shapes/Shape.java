package shapes;

import shapes.colors.Colors;

public abstract class Shape {
    String name;
    double measuringItemValue;
    Colors color;

    public abstract double getArea();
    abstract String getMeasuringItem();

    String getName() {
        return name;
    }

    String getColor() {
        return color.getColor();
    }


    public void draw() {

    }
}
