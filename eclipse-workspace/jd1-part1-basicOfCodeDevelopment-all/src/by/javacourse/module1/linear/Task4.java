package by.javacourse.module1.linear;
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях)
//Поменять местами дробную и целую части числа и вывести полученное значение числа
public class Task4 {

	public static void main(String[] args) {

		double a;
		double b;
		double result;
		int temp;

		a = 169.509;
		temp = (int) a;
		b = a * 1000 - temp * 1000;
		result = (double) b + (double) temp / 1000;

		System.out.println("number is " + a);
		System.out.println("result is " + result);

	}

}
