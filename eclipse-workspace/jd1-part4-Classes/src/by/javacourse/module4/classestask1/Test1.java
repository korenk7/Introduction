package by.javacourse.module4.classestask1;
// Создайте класс Test 1 с двумя переменными. Добавьте метод вывода на экран и методы изменения
//этих переменых. Добавьте метод, который находит сумму значений этих переменных
// и метод, который находит наибольшее значение из этих двух переменных
public class Test1 {

	private int x1;
	private int x2;

	public void printValues() {

		System.out.println("value 1 = " + x1);
		System.out.println("value 2 = " + x2);

	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getBigger() {
		if (x1 >= x2) {
			return x1;
		} else {
			return x2;
		}

	}

}
