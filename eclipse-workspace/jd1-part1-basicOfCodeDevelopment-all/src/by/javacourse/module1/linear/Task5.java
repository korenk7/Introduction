package by.javacourse.module1.linear;

// дано натуральное число Т, которое представляет длительность прошедшего времени в секундах
//Вывести значение длительности в часах, минутах, секундах в форме ННч ММ мин SSc.
public class Task5 {

	public static void main(String[] args) {

		int time;
		int h;
		int m;
		int s;

		time = 3600;
		h = time / 3600;
		m = time / 60 - h * 60;
		s = time - h * 3600 - m * 60;

		System.out.println(h + "ч " + m + "м " + s + "c");

	}

}
