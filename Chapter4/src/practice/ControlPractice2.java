package practice;

public class ControlPractice2 {

	public static void main(String[] args) {
		int num;
		int times;
		
		for (num = 2; num <= 9; num++) {
			if (num % 2 == 1)
				continue;
			
			for (times = 1; times <= 9; times++) {
				System.out.println(num + " x " + times + " = " + (num * times));
			}
			System.out.println("\n");
		}
	}

}
