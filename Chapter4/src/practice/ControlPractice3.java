package practice;

public class ControlPractice3 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				System.out.println(dan + " x " + times + " = " + (dan * times));
				if (dan <= times)
					break;
			}
			System.out.println("\n");
		}
	}

}
