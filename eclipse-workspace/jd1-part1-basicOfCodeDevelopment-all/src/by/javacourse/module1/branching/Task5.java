package by.javacourse.module1.branching;

// ��������� �������� ������� x^2-3x+9 ���� �<=3;
//							  1/(x^3+6) ���� x>3;
import java.util.*;
public class Task5 {
	
	
	public static void main(String[] args) {
		
		double x;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ����� �");
		x = sc.nextDouble();
		
		if(x<=3) {
			System.out.println("F(x) = "+ (Math.pow(x, 2)-3*x+9));
		}
		else {
			System.out.println("F(x) = "+ (1/(Math.pow(x, 3)+6)));
		}
		


	}

}
