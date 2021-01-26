package chapter2;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String intNumber; 
		
		System.out.println("'글'에 해당하는 숫자를 입력해주세요 : ");
		intNumber = input.nextLine();
		int unicodeNumber = Integer.valueOf(intNumber, 16);
		
		
		char unicodeName = (char)unicodeNumber;
		System.out.println(unicodeName);
		
		input.close();
		
		
	}

}
