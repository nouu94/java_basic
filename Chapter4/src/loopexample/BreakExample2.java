package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		
//		for (num = 0; ; num++) {
//			sum += num; 
//			if (sum >= 100) {
//				break;
//			}
//		}
//		System.out.println(num);
//		System.out.println(sum);
		
		for (num = 1; ; num++) {
			sum += num;
			if (sum >= 500) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
