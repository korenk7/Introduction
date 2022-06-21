package by.javacourse.module4.classestask2;
	// создайте класс с двумя переменными. Добавьте конструктор со входными параметрами и значениями по умолчанию
	// добавьте set и get методы экземпляра класса
public class Test2 {

	double a;
	double b;

	public Test2() {
		a = 10;
		b = 15;
	}

	public Test2(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
