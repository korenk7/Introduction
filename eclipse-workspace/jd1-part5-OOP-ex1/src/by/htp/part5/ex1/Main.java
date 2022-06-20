package by.htp.part5.ex1;

/*������� ������ ������ ��������� ����, ��������� ������ ����, ����������. 
 * ������: �������, �������������, ������� ����������, ���������,�������*/
public class Main {

	public static void main(String[] args) {
		
		FileLogic fileLogic = new FileLogic();
		TextFileLogic textFileLogic = new TextFileLogic();
		
		File file = fileLogic.fileCreating(); // ��������� ������ �������� ������ ������������� ������ �������� ������
		System.out.println(file.toString());
		
		File file1 = textFileLogic.fileCreating(); // ��������� ������ ������������ ������ ������������� ������ �������� ������
		System.out.println(file1.toString());
		//� ������� file1 ��� ������� � ���� content,�.�. ������ ��������� �������� ������ File.
		
		//TextFile textfile = fileLogic.fileCreating(); 
		//���������� ������� ������ �������� ������ �� ������ ������������
		
		TextFile textfile = textFileLogic.fileCreating(); //��������� ������ ������������ �� ������ ������������
		
		
		
		textfile.fileRenaming(); // ������ ������������ ������ ���������� ������� �������� ��� ���������������
		
		textfile.textUpdating(" more text"); // ������ ������������ ������ ���������� ����� �������
		
		textfile.textShowing();
		
		textfile.textDelete();
		
		System.out.println(textfile.toString());


		
	}

}
