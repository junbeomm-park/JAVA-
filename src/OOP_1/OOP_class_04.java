package OOP_1;
//메소드의 실행 흐름   
public class OOP_class_04 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiplay(5L, 3L);
		double result4 = mm.divide(5L,3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiplay(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);

		
		
	}

}


class MyMath   {
	
	long add (long a, long b) {
		long result = a+b;
		return result;
		
	}
	
	long subtract (long a, long b) {
		long result = a-b;
		return result;
	}
	
	long multiplay(long a, long b) {
		long result = a*b;
		return result;
	}
	double divide (double a, double b) {
		double  result = a/b;
		return result;
	}
	
}