package by.htp.part5.ex1;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести содержимое, дополнить,удалить*/
public class Main {

	public static void main(String[] args) {
		
		FileLogic fileLogic = new FileLogic();
		TextFileLogic textFileLogic = new TextFileLogic();
		
		File file = fileLogic.fileCreating(); // создается объект базового класса присваивается ссылке базового класса
		System.out.println(file.toString());
		
		File file1 = textFileLogic.fileCreating(); // создается объект производного класса присваивается ссылке базового класса
		System.out.println(file1.toString());
		//у объекта file1 нет доступа к полю content,т.к. доступ ограничен методами класса File.
		
		//TextFile textfile = fileLogic.fileCreating(); 
		//невозможно создать объект базового класса по ссылке производного
		
		TextFile textfile = textFileLogic.fileCreating(); //создается объект производного по ссылке производного
		
		
		
		textfile.fileRenaming(); // объект производного класса пользуется методом базового без переопределения
		
		textfile.textUpdating(" more text"); // объект производного класса пользуется своим методом
		
		textfile.textShowing();
		
		textfile.textDelete();
		
		System.out.println(textfile.toString());


		
	}

}
