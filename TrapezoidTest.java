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
        assertEquals(12.47213595499958, t.perimeter());
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

    @Test
    public void testTrapezoidArea3 () {
        Point A = new Point (0, 0);
        Point C = new Point (0, 2);
        Point B = new Point (4, 2);
        Point D = new Point (4, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(8, t.area());
    }

    @Test
    public void testTrapezoidArea4 () {
        Point C = new Point (0, 0);
        Point A = new Point (0, 2);
        Point B = new Point (4, 2);
        Point D = new Point (4, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(8, t.area());
    }

    @Test
    public void testTrapezoidArea5 () {
        Point B = new Point (0, 0);
        Point A = new Point (0, 2);
        Point C = new Point (4, 2);
        Point D = new Point (4, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(8, t.area());
    }

    @Test
    public void testTrapezoidArea6 () {
        Point D = new Point (0, 0);
        Point C = new Point (0, 2);
        Point B = new Point (4, 2);
        Point A = new Point (4, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(8, t.area());
    }

    @Test
    public void testTrapezoidArea7 () {
        Point B = new Point (0, 0);
        Point C = new Point (0, 2);
        Point D = new Point (4, 2);
        Point A = new Point (4, 0);
        Trapezoid t = new Trapezoid(A, B, C, D);
        assertEquals(8, t.area());
    }

}