package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환이 되고 더해짐 1이 나오겠죠?
		int iNum4 = (int)(dNum1 + fNum2); // 두 실수가 더해지고 형 변환이 됨 2가 나오겠져? 
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
