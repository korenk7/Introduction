package by.javacourse.module4.classestask5;

import java.util.Scanner;

public class Counter {

	private int upLimit;
	private int downLimit;
	private int value;

	public Counter() {

	}

	public Counter(int upLimit, int downLimit, int value) {
		this.upLimit = upLimit;
		this.downLimit = downLimit;
		this.value = value;
	}

	public int getUpLimit() {
		return upLimit;
	}

	public void setUpLimit(int upLimit) {
		if (upLimit > getDownLimit()) {
			this.upLimit = upLimit;
		} else {
			System.out.println("значение верхнего предела должно быть больше значения нижнего предела");
			System.out.println("можно попробовать ещё раз");
			setUpLimit(intChecking());
		}
	}

	public int getDownLimit() {
		return downLimit;
	}

	public void setDownLimit(int downLimit) {
		this.downLimit = downLimit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value > getDownLimit() && value < getUpLimit()) {
			this.value = value;
		} else {
			System.out.println("значение счетчика должно быть между нижним и верхним пределами");
			System.out.println("можно попробовать ещё раз");
			setValue(intChecking());
		}
	}


	public void increment() {
		int newValue;
		System.out.println("работает метод инкремент");

		if (getValue() < getUpLimit()) {
			newValue = getValue();
			newValue++;
			setValue(newValue);
		} else {
			System.out.println("достигнута верхняя граница");
		}

	}

	public void decrement() {
		int newValue;
		System.out.println("работает метод декремент");

		if (getValue() > getDownLimit()) {
			newValue = getValue();
			newValue--;
			setValue(newValue);
		} else {
			System.out.println("достигнута нижняя граница");
		}

	}
	
	public static int intChecking() {

		String str;
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}
		value = sc.nextInt();

		return value;

	}

	@Override
	public String toString() {
		return "Counter random value=" + value;
	}

}
