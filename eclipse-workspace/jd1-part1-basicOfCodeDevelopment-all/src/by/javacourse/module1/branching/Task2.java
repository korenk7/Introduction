package by.javacourse.module1.branching;

// Найти max{min(a,b),min(c,d)}
public class Task2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double result;

		a = 1.4;
		b = -38;
		c = 11;
		d = -100.4;

		result = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println("Result is " + result);

	}

}
