package chapter2;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String intNumber; 
		
		System.out.println("'��'�� �ش��ϴ� ���ڸ� �Է����ּ��� : ");
		intNumber = input.nextLine();
		int unicodeNumber = Integer.valueOf(intNumber, 16);
		
		
		char unicodeName = (char)unicodeNumber;
		System.out.println(unicodeName);
		
		input.close();
		
		
	}

}
