package by.javacourse.module1.cycles;

// найти сумму квадратов первых ста чисел
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum;
		sum = 0;

		for(int i = 1; i<=100;i++) {
			
			sum += Math.pow(i, 2);
			
		}
		System.out.println("Summ of first 100^2 is "+sum);
	}

}
