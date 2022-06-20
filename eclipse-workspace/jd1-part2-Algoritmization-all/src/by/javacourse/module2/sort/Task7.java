package by.javacourse.module2.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Пусть даны 2 неубывающие последовательности. 
//Требуется указать места где нужно вставить элементы новой последовательности чтобы новая последовательность оставалась возрастающей. 

public class Task7 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(11);
		list1.add(100);
		list1.add(104);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(7);
		list2.add(22);
		list2.add(27);
		list2.add(39);

		System.out.println(list1.toString());
		System.out.println(list2.toString());

		List<Integer> indexes = indexesSearch(list1, list2);
		System.out.println("индексы бинарного поиска " + indexes);

		for (int i = 0; i < indexes.size(); i++) {
			list1.add(indexes.get(i), list2.get(i));
		}
		
		System.out.println("После вставки " + list1);
	}

	public static List<Integer> indexesSearch(List<Integer> list1, List<Integer> list2) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < list2.size(); i++) {
			int dex = Collections.binarySearch(list1, list2.get(i));
			if (dex < 0)
				result.add(-(dex + 1) + i);
			else
				result.add(dex + i);
		}
		return result;
	}
}