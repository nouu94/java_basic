package practice;

public class StarPractice {

	public static void main(String[] args) {
//		int lineCount = 4; 
//		int starCount = 1;
//		
//		for (int i = 0; i < lineCount; i++) {
//			for (int j = 0; j < starCount; j++) {
//				System.out.print("*");
//			}
//			starCount += 2;
//			System.out.println("");
//		}
		
//		int lineCount = 4;
//		int starCount = 7;
//		int spaceCount = lineCount / 2 - 2;
//		
//		for (int i = 0; i < lineCount; i++) {
//			for (int j = 0; j < spaceCount; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < starCount; j++) {
//				System.out.print("*");
//			}
//			starCount -= 2;
//			spaceCount += 1;
//			System.out.println();
//		}
		
		int lineCount = 7;
		int starCount = 1;
		int spaceCount = lineCount / 2 + 1;
		
		for (int i = 0; i < lineCount; i++) {
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			
			if ( i < lineCount / 2) { // 0, 1, 2
				spaceCount -= 1;
				starCount += 2;
			}
			else {					// 3, 4, 5
				spaceCount += 1;
				starCount -= 2;
			}
			System.out.println("");
		}
	}

}
