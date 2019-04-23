import org.junit.Test;
import shapes.RectangularTriangle;
import shapes.Shape;
import shapes.Square;
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
}
