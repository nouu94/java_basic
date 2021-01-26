package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른 문자열은 대입이 가능합니다. 
//		str = 3; str 변수는 String 형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없습니다.
	}

}
