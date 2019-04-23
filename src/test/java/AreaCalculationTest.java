import org.junit.Test;
import shapes.*;
import shapes.colors.Colors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AreaCalculationTest {

    private Shape shape;

    @Test
    public void squareAreaCalculation() {
        shape = new Square(5, Colors.BLACK);
        assertThat(shape.getArea(), is(25.0));
    }

    @Test
    public void triangleAreaCalculation() {
        shape = new RectangularTriangle(2.82842712474619, 45, Colors.BLUE);
        assertThat(shape.getArea(), is(2.0));
    }

    @Test
    public void circleAreaCalculation() {
        shape = new Circle(2, Colors.GREEN);
        assertThat(shape.getArea(), is(12.5664));
    }

    @Test
    public void trapezoidAreaCalculation() {
        shape = new Trapezoid(4, 6, 3, Colors.YELLOW);
        assertThat(shape.getArea(), is(15.0));
    }
}
