package shapes;

import shapes.colors.Colors;

public class Square extends Shape {
    private final static String NAME = "square";
    private final static String SQUARE_SIDE = "square side";

    private double squareSide;

    public Square(double squareSide, Colors color) {
        this.name = NAME;
        this.color = color;
        this.squareSide = squareSide > 0 ? squareSide : 0;
    }

    public double getArea() {
        return Math.rint(squareSide * squareSide * 100000) / 100000;
    }

    void drawMeasuringItems() {
        System.out.print(SQUARE_SIDE + ": " + squareSide);
    }
}
