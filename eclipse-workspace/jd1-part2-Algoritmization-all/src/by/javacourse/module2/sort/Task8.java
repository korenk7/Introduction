package by.javacourse.module2.sort;

import java.util.Arrays;

public class Task8 {
// даны дроби (p1/q1; p2/q2... pn/qn)( P и q натуральные).
	// Составить программу, которая приводит дроби к общему знаменателю и
	// упорядочивает их
	// в порядке возрастания
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerators = new int[] { 5, 12, 6, 14 };
		int[] denominators = new int[] { 7, 13, 2, 28 };

		int commonDenominator = 1;
		for (int i = 0; i < denominators.length; i++) {
			commonDenominator = commonDenominator * denominators[i];
		}

		for (int i = 0; i < numerators.length; i++) {
			
			numerators[i] = commonDenominator / denominators[i] * numerators[i];
			denominators[i]=commonDenominator;
		}
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(numerators));
		System.out.println(Arrays.toString(denominators));
		
		Arrays.sort(numerators);
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(numerators));
		System.out.println(Arrays.toString(denominators));
		
		
	}

}
