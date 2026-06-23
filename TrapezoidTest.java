import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrapezoidTest {

    @Test
    public void testTrapezoidPerimeter () {
        Point A = new Point (0, 0);
        Point B = new Point (1, 2);
        Point C = new Point (4, 2);
        Point D = new Point (5, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(12.472135955, t.perimeter());
    }

    @Test
    public void testTrapezoidArea1 () {
        Point A = new Point (0, 0);
        Point B = new Point (1, 2);
        Point C = new Point (4, 2);
        Point D = new Point (5, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(8, t.area());
    }

    @Test
    public void testTrapezoidArea2 () {
        Point A = new Point (0, 0);
        Point B = new Point (0, 2);
        Point C = new Point (4, 2);
        Point D = new Point (4, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(8, t.area());
    }

}