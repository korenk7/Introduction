package by.htp.part5.ex1;

import java.util.Scanner;

public class FileLogic {
	Scanner sc = new Scanner(System.in);
	
	public File fileCreating() {
		
		System.out.println("Enter file name");
		String name = sc.next();
		System.out.println("Enter way to creatig file");
		String way = sc.next();

		File file = new File(way, name);
		System.out.println("it's file");
		
		return file;
		
	}

}
