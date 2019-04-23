package shapes;

import shapes.colors.Colors;

public class Square extends Shape {
    private final static String NAME = "square";
    private final static String MEASURING_ITEM = "square side";

    public Square(double measureItem, Colors color) {
        this.name = NAME;
        this.measuringItemValue = measureItem;
        this.color = color;
    }

    public double getArea() {
        return measuringItemValue * measuringItemValue;
    }

    protected String getMeasuringItem() {
        return MEASURING_ITEM + " " + measuringItemValue;
    }
}
