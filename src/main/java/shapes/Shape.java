package shapes;

public abstract class Shape {
    protected String name;
    protected double measuringItemValue;
    protected String color;

    protected abstract void getName();
    protected abstract double getArea();
    protected abstract String getMeasuringItem();
    protected abstract void getColor();


    public void draw() {

    }
}
