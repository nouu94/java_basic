package practice;

public class ControlPractice4 {

	public static void main(String[] args) {
//		int i; 
//		int j;
//		
//		for (i = 0; i < 4; i++) {
//			for (j = 0; j < 3-i; j++) {
//				System.out.print(" ");
//			}
//			for (j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		int lineCount = 4; 
		int starCount = 1; 
		int spaceCount = lineCount/2 + 1;
		
		for( int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) { // left
				System.out.print(" ");
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) { // right
				System.out.print(" ");
			}
			spaceCount -=1;
			starCount +=2;
			System.out.println();
		}
	}

}
