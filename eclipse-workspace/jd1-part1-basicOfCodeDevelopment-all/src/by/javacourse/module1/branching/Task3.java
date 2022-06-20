package by.javacourse.module1.branching;

// Даны 3 точки А(x1,y1) B(x2,y2), C(x3,y3).Определить будут ли они находиться на одной прямой.
public class Task3 {

	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		double m;
		double c;

		x1 = 4;
		y1 = 8;
		x2 = 6;
		y2 = 8;
		x3 = 9;
		y3 = 9;

		m = (y2 - y1) / (x2 - x1);
		c = y1 - m * x1;

		if (m * x3 + c == y3) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}

	}

}
