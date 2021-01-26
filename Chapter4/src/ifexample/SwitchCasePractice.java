package ifexample;

public class SwitchCasePractice {

	public static void main(String[] args) {
		int elivatorButton = 5;
		String location = "";
		
		switch (elivatorButton) {
		case 1 : location = "약국";
			break;
		case 2 : location = "정형외과"; 
			break;
		case 3 : location = "피부과"; 
			break;
		case 4 : location = "치과";
			break;
		case 5 : location = "헬스 클럽";
			break;
		default :
			System.out.println("이상한 것을 누르신 것 아니에요?");
		}
		System.out.println(elivatorButton + "층 " + location + "입니다.");
	}

}
