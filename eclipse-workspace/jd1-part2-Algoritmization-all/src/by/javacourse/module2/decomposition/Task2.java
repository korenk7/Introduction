package by.javacourse.module2.decomposition;

import java.util.Scanner;

public class Task2 {
	// Ќаписать метод(методы)дл€ нахождени€ наибольшего общего делител€
	// четырех натуральных чисел
	
	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		int n4;
	
		int nod;

		System.out.println("¬ведите первое натуральное число");
		n1 = console();

		System.out.println("¬ведите второе натуральное число");
		n2 = console();

		System.out.println("¬ведите третье натуральное число");
		n3 = console();
		
		System.out.println("¬ведите четвертое натуральное число");
		n4 = console();
		
		
		nod = nodFinding(n1,n2,n3,n4);
		System.out.println("Ќаибольший общий делитель = " + nod);
		
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
			naturalValue = console();
		}

		return naturalValue;
	}

	
	public static int nodFinding(int n1, int n2, int n3, int n4) {

		int n1n2;
		int n1n2n3;
		int n1n2n3n4;
		
		n1n2 = nodFinding(n1,n2);
		
		n1n2n3 = nodFinding(n1n2,n3);
		
		n1n2n3n4 = nodFinding(n1n2n3,n4);

		return n1n2n3n4;

	}
	
	public static int nodFinding(int n1, int n2) {

		while (n2 != 0) {
			int tmp = n1 % n2;
			n1 = n2;
			n2 = tmp;
		}

		return n1;

	}


}