package ifexample;

public class SwitchCasePractice {

	public static void main(String[] args) {
		int elivatorButton = 5;
		String location = "";
		
		switch (elivatorButton) {
		case 1 : location = "�౹";
			break;
		case 2 : location = "�����ܰ�"; 
			break;
		case 3 : location = "�Ǻΰ�"; 
			break;
		case 4 : location = "ġ��";
			break;
		case 5 : location = "�ｺ Ŭ��";
			break;
		default :
			System.out.println("�̻��� ���� ������ �� �ƴϿ���?");
		}
		System.out.println(elivatorButton + "�� " + location + "�Դϴ�.");
	}

}
