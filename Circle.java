public class Circle {
	Point center;
	double radius;
	
	public Circle() {
		this.center = new Point(0, 0);
		this.radius = 1.0;
	}
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public boolean isInside(Point p) {
		return center.distance(p) <= radius;
	}
}