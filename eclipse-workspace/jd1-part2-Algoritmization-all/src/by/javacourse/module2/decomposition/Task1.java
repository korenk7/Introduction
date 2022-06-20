package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task1 {
	// Ќаписать метод(методы)дл€ нахождени€ наибольшего общего делител€
	// и наименьшего общего кратного двух чисел
	public static void main(String[] args) {
		int n1;
		int n2;
		int nod;
		int nok;

		System.out.println("¬ведите первое натуральное число");
		n1 = console();

		System.out.println("¬ведите второе натуральное число");
		n2 = console();

		nod = nodFinding(n1, n2);
		System.out.println("Ќаибольший общий делитель = " + nod);

		nok = nokFinding(n1, n2, nod);
		System.out.println("Ќаиеньшее общее кратное = " + nok);

	}

	public static int console() {

		String str;
		int naturalValue;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			str = sc.nextLine();
			System.out.println("try one more time, " + str + " it's not a Integer");
		}

		naturalValue = sc.nextInt();

		if (naturalValue <= 0) {
			System.out.println("try one more time, num must me > 0");
			console();
		}

		return naturalValue;
	}

	public static int nodFinding(int n1, int n2) {

		while (n2 != 0) {
			int tmp = n1 % n2;
			n1 = n2;
			n2 = tmp;
		}

		return n1;

	}

	public static int nokFinding(int n1, int n2, int nod) {

		return (n1 * n2) / nod;

	}

}
