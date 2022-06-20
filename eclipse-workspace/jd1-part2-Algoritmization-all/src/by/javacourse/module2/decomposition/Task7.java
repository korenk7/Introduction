package by.javacourse.module2.decomposition;

public class Task7 {
	// �������� ����� ������ ��� ���������� ����� ����������� ���� �������� ����� ��
	// 1 �� 9
	public static void main(String[] args) {
		int n = 9;
		int summ;

		summ = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {

				summ = summ + faktorialCounting(i);
			}
		}

		System.out.println("����� ����������� ���� �������� ����� �� 1 �� 9 = " + summ);

	}

	public static int faktorialCounting(int n) {
		int result;

		result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		return result;

	}

}
