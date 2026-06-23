public class Trapezoid {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Trapezoid(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}

  // Assume a non-vertical, valid trapezoid
  public double area() {
    Point[] pair1 = new Point[2];
    Point[] pair2 = new Point[2];

    double between_pt_x;
    double left_leg;
    double right_leg;
    double smaller_base;
    double larger_base;
    double height;

    pair1[0] = A;
    if (A.y == B.y)
    {
      pair1[1] = B;

      pair2[0] = C;
      pair2[1] = D;
    }
    else
    {
      pair2[0] = B;
    }

    if (pair1[1] == null && A.y == C.y)
    {
      pair1[1] = C;

      pair2[1] = D;
    }
    else if (pair1[1] == null)
    {
      pair1[1] = D;

      pair2[1] = C;
    }

    between_pt_x = (pair1[0].x + pair1[1].x) / 2;

    if (pair1[0].x < between_pt_x)
    {
      if (pair2[0].x < between_pt_x)
      {
        left_leg = pair1[0].distance(pair2[0]);
        right_leg = pair1[1].distance(pair2[1]);
      }
      else
      {
        left_leg = pair1[0].distance(pair2[1]);
        right_leg = pair1[1].distance(pair2[0]);
      }
    }

    else
    {
      if (pair2[0].x < between_pt_x)
      {
        left_leg = pair1[1].distance(pair2[0]);
        right_leg = pair1[0].distance(pair2[1]);
      }
      else
      {
        left_leg = pair1[1].distance(pair2[1]);
        right_leg = pair1[0].distance(pair2[0]);
      }
    }

    larger_base = Math.max(pair1[0].distance(pair1[1]), pair2[0].distance(pair2[1]));
    smaller_base = Math.min(pair1[0].distance(pair1[1]), pair2[0].distance(pair2[1]));

    height = Math.abs(pair1[0].y - pair2[0].y);
    
    return ((smaller_base + larger_base) / 2) * height;
  }
}