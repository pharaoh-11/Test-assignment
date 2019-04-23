import org.junit.Test;
import shapes.Square;
import shapes.colors.Colors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AreaCalculationTest {

    @Test
    public void squareAreaCalculation() {
        Square square = new Square(5, Colors.BLACK);
        assertThat(square.getArea(), is(25.0));
    }
}
