package by.javacourse.module1.linear;

//вычислить значение выражения по формуле (все переменные принимают действительные значения)
//(b+sqr(b^2+4ac))/2a -a^3 + b^-2
public class Task2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double result;

		a = 0.1;
		b = 5.8;
		c = 4.4;

		double up;
		double down;

		up = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		down = 2 * a;

		result = up / down - Math.pow(a, 3) + Math.pow(b, -2);

		System.out.println("result is " + result);

	}

}
