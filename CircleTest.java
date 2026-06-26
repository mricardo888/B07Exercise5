import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testPerimeter() {
        Point p1 = new Point(1.0, 1.0);
        Circle c1 = new Circle(p1, 3);
        assertEquals(2*Math.PI*3, c1.perimeter());
    }

    @Test
    void testArea() {
        Circle c1 = new Circle();
        assertEquals(Math.PI, c1.area());
    }
    @Test
    void testIsInside() {
        Point p1 = new Point(1.0, 1.0);
        Circle c1 = new Circle(p1, 3);
        assertTrue(c1.isInside(p1));
    }
    @Test
    void testIsNotInside() {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(10.0, 5.0);
        Circle c1 = new Circle(p1, 3);
        assertFalse(c1.isInside(p2));
    }
}