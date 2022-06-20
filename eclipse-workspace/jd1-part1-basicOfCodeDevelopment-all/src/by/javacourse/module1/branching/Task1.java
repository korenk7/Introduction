package by.javacourse.module1.branching;

// Даны 2 угла треугольника в градусах. Определить существует ли такой треугольник,
// и если да, то будет ли он прямоугольным
public class Task1 {

	public static void main(String[] args) {
		double alpha;
		double beta;
		double gamma;

		alpha = 178;
		beta = 1;
		gamma = 180 - alpha - beta;

		if (gamma > 0) {
			System.out.println("there can be this triangle");
			if (alpha == 90 || beta == 90 || gamma == 90) {
				System.out.println("This triangle have 90 degrees corner");
			} else {
				System.out.println("This triangle doesn't have 90 degrees corner");
			}
		} else {
			System.out.println("there can't be triangle with this paremetrs");
		}
	}

}
