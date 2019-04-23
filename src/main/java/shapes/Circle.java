package shapes;

import shapes.colors.Colors;

public class Circle extends Shape {
    private final static String NAME = "circle";
    private final static String MEASURING_ITEM = "radius";

    public Circle(double measureItem, Colors color) {
        this.name = NAME;
        this.color = color;
        this.measuringItemValue = measureItem > 0 ? measureItem : 0;
    }

    public double getArea() {
        return Math.rint(measuringItemValue * measuringItemValue * Math.PI * 10000) / 10000;
    }

    String getMeasuringItem() {
        return MEASURING_ITEM + ": " + measuringItemValue;
    }
}
