package by.javacourse.module1.linear;

//вычислить значение выражения по формуле (все переменные принимают действительные значения)
//(sin x + cos y)/(cos x - sin y) * tg (xy)

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double result;
		
		x=0;
		y=0;
		
		result =(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
		
		System.out.println("result is " + result);
	}

}
