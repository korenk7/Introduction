package by.javacourse.module2.stringlikestring;

public class Task4 {
	// � ������� ������� ����������� � ������������� ��������� �� �����
	// "�����������" ����� "����"
	public static void main(String[] args) {

		String s = "�����������";
		StringBuilder newStr = new StringBuilder();
		
		newStr.append(s.charAt(7)).append(s.substring(3, 5)).append(s.charAt(7));
		
		System.out.println(newStr);
	}

}
