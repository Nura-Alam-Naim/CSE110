import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double s1, s2, s3;
		System.out.print("Enter side1: ");
		s1 = inp.nextDouble();
		System.out.print("Enter side2: ");
		s2 = inp.nextDouble();
		System.out.print("Enter side3: ");
		s3 = inp.nextDouble();
		inp.nextLine();
		System.out.print("Enter color: ");
		String col = inp.nextLine();
		System.out.print("Is it filled? ");
		boolean b = inp.nextBoolean();
		try {
			Triangle t = new Triangle(s1, s2, s3, col, b);
			System.out.println(t.toString());
			System.out.println("Area: " + t.getArea());
			System.out.println("Perimeter: " + t.getPerimeter());
		} catch (IllegalTriangleException e) {
			System.out.println(e);
		}
	}
}

class GeoMetricObject {
	private String color;
	private boolean filled;

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}
}

class Triangle extends GeoMetricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	Triangle(double s1, double s2, double s3, String col, boolean f) throws IllegalTriangleException {
		if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
			this.side1 = s1;
			this.side2 = s2;
			this.side3 = s3;
			super.setColor(col);
			super.setFilled(f);
		} else {
			throw new IllegalTriangleException("Invalid Triangle");
		}
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() {
		return side3 + side2 + side1;
	}

	public String toString() {
		return "Triangle: side1 " + side1 + " side2 " + side2 + " side3 " + side3 +
				" color " + getColor() + " filled " + isFilled();
	}
}

class IllegalTriangleException extends Exception {
	public IllegalTriangleException(String str) {
		super(str);
	}
}
