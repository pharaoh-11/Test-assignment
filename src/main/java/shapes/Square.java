package shapes;

import shapes.colors.Colors;

import static tools.FixMeasureOfInaccuracy.fixInaccuracy;

public class Square extends Shape {
    private final static String NAME = "square";
    private final static String SQUARE_SIDE = "square side";

    private double squareSide;

    public Square(double squareSide, Colors color) {
        this.name = NAME;
        this.color = color;
        if(squareSide > 0) {
            this.squareSide = squareSide;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getArea() {
        return fixInaccuracy(squareSide * squareSide);
    }

    void drawMeasuringItems() {
        System.out.print(SQUARE_SIDE + ": " + squareSide);
    }
}
