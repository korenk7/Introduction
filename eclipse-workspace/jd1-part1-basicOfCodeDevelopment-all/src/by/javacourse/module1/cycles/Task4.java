package by.javacourse.module1.cycles;

import java.math.BigDecimal;
// ����� ������������ ��������� ������ 200 �����
public class Task4 {

	public static void main(String[] args) {
		
		BigDecimal mult = BigDecimal.valueOf(1);

		for (int i = 1; i <= 200; i++) {
			
			mult = mult.multiply(BigDecimal.valueOf(i*i));
	
		}
		
		System.out.println(mult);

	}

}
