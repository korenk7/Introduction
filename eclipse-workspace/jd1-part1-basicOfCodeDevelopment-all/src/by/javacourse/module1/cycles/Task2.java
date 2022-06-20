package by.javacourse.module1.cycles;



//вычислить значения функции на отрезке [a,b]с шагом h;
// y=x x>2;  y=-x x<=2
public class Task2 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;



		a = -2;
		b = 5;
		h = 0.5;

		for (double i = a; i <= b; i += h) {
			if (i <= 2) {
				System.out.println("X value = " + i);
				System.out.println("Y value = " + (-i));
			}
			if (i > 2) {
				System.out.println("X value = " + i);
				System.out.println("Y value = " + i);
			}

		}
	}

}
