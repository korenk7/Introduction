package by.javacourse.module4.classestask6;

public class Time {
	private int hour;
	private int min;
	private int sec;

	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Time(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		if (hour < 0 || hour >= 24) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < 0 || min >= 60) {
			this.min = 0;
		} else {
			this.min = min;
		}

	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec < 0 || sec >= 60) {
			this.sec = 0;
		} else {
			this.sec = sec;
		}

	}

	public void addHour(int hour) {

		if (hour < 0) {
			getHour();
		} else {
			setHour(getHour() + hour);
		}
	}

	public void addMin(int min) {

		if (min < 0) {
			getHour();
		} else {
			setMin(getMin() + min);
		}
	}

	public void addSec(int sec) {

		if (sec < 0) {
			getSec();
		} else {
			setSec(getSec() + sec);
		}
	}

	public void reduceHour(int hour) {

		if (hour < 0) {
			getHour();
		} else {
			setHour(getHour() - hour);
		}
	}

	public void reduceMin(int min) {

		if (min < 0) {
			getMin();
		} else {
			setMin(getMin() - min);
		}
	}

	public void reduceSec(int sec) {

		if (sec < 0) {
			getSec();
		} else {
			setSec(getSec() - sec);
		}
	}

	// to string с проверкой значений. Если количество часов\минут\секунд
	// предполагает ноль перед цифрой, он проставится при выводе на печать
	@Override
	public String toString() {
		
		int counterOfZeros = 0; // счётчик для определения количества нулей. цифры взяты таким образом чтобы не повторялись 
		if (hour < 10) {
			counterOfZeros++;
		}
		if (min < 10) {
			counterOfZeros = counterOfZeros + 3;
		}
		if (sec < 10) {
			counterOfZeros = counterOfZeros + 5;
		}
		
		
		
		if (counterOfZeros == 1) {
			return "Time [0" + hour + " : " + min + " : " + sec + "]";
		}
		if (counterOfZeros == 4) {
			return "Time [0" + hour + " : 0" + min + " : " + sec + "]";
		}
		if (counterOfZeros == 9) {
			return "Time [0" + hour + " : 0" + min + " : 0" + sec + "]";
		}
		if (counterOfZeros == 3) {
			return "Time [" + hour + " : 0" + min + " : " + sec + "]";
		}
		if (counterOfZeros == 8) {
			return "Time [" + hour + " : 0" + min + " : 0" + sec + "]";
		}
		if (counterOfZeros == 6) {
			return "Time [0" + hour + " : " + min + " : 0" + sec + "]";
		}
		if (counterOfZeros == 5) {
			return "Time [" + hour + " : " + min + " : 0" + sec + "]";
		} else

			return "Time [" + hour + " : " + min + " : " + sec + "]";

	}

}
