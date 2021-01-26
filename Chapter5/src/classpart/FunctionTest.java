package classpart;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
//		cal(num1, num2, '/');
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "ÀÔ´Ï´Ù.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int minus(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int multiple(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int devide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	
//	public static void cal(int n1, int n2, char n3) {
//		int result;
//		
//		if (n3 == '+') {
//			result = n1 + n2;
//			System.out.println(result);
//		}
//		if (n3 == '-') {
//			result = n1 - n2;
//			System.out.println(result);
//		}
//		if (n3 == '*') {
//			result = n1 * n2;
//			System.out.println(result);
//		}
//		if (n3 == '/') {
//			result = n1 / n2;
//			System.out.println(result);
//		}
}
