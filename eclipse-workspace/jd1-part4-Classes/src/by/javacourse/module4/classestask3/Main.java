package by.javacourse.module4.classestask3;

public class Main {

	public static void main(String[] args) {

		Student[] studentList = new Student[10];

		studentList[0] = new Student("Alex", "Ferguson", "MU", new int[] { 5, 6, 7, 8, 9 });
		studentList[1] = new Student("Zinedin", "Zidan", "Real", new int[] { 6, 8, 9, 9, 8 });
		studentList[2] = new Student("Ole", "Soulsher", "MU", new int[] { 8, 9, 8, 9, 8 });
		studentList[3] = new Student("Klaudio", "Ranieri", "Lester", new int[] { 6, 8, 9, 9, 8 });
		studentList[4] = new Student("Jrgen", "Klopp", "Liverpool", new int[] { 9, 10, 9, 10, 9 });
		studentList[5] = new Student("Josep ", "Guardiola", "Man City", new int[] { 6, 8, 9, 9, 8 });
		studentList[6] = new Student("Ralf ", "Rangnick", "Man Utd", new int[] { 6, 8, 9, 9, 8 });
		studentList[7] = new Student("Michael ", "Carrick", "Man Utd", new int[] { 6, 8, 9, 9, 8 });
		studentList[8] = new Student("Eddie", "Howe", "Newcastle", new int[] { 9, 9, 9, 9, 9 });
		studentList[9] = new Student("Steve", "Bruce", "Newcastle", new int[] { 10, 10, 10, 9, 9,10 });

		studentCheck(studentList);

		
	}

	public static void studentCheck(Student[] studentList) {
		int idealmark1 = 9;
		int idealmark2 = 10;

		for (int i = 0; i < studentList.length; i++) {
			int countOfIdealMarks = 0;

			for (int j = 0; j < studentList[i].getmarkList().length; j++) {
				if (studentList[i].getmarkList()[j] == idealmark1 ||
					studentList[i].getmarkList()[j] == idealmark2) {
					countOfIdealMarks++;
				}
			}
			if(countOfIdealMarks == studentList[i].getmarkList().length ) {
				System.out.println(studentList[i].toString());
			}
			countOfIdealMarks=0;
		}
	}

}
