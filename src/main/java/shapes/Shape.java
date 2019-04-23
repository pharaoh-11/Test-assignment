package shapes;

import shapes.colors.Colors;

public abstract class Shape {
    String name;
    double measuringItemValue;
    Colors color;

    abstract String getName();
    public abstract double getArea();
    abstract String getMeasuringItem();
    abstract String getColor();


    public void draw() {

    }
}
