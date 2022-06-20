package by.javacourse.module4.classestask4;

import java.util.Comparator;

public class TrainComparator implements Comparator<Train> {


	@Override
	public int compare(Train o1, Train o2) {
		int value1 = o1.getTimeOfDeparture().compareTo(o2.getTimeOfDeparture());
		return value1;
	}

}
