package by.javacourse.module1.branching;

//������ ��������� � � � �������������� ��������� � ������� x,y,z �������.
//����������, ������� �� ������ ����� ���������
public class Task4 {

	public static void main(String[] args) {

		double a;
		double b;

		double x;
		double y;
		double z;

		a = 7;
		b = 8;

		x = 8;
		y = 8;
		z = 7;

		if (x < a && y < b || y < a && x < b || x < a && z < b || z < a && x < b || y < a && z < b || z < a && y < b) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
