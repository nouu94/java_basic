package classpart;

public class Student {
	int studentID; //�й� �������1
	String studentName; //�л� �̸� �������2
	int grade; //�г� �������3
	String adress; //��� �� �������4
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + adress);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentChoi = new Student();
		studentChoi.studentName = "������";
		
		System.out.println(studentChoi.studentName);
		System.out.println(studentChoi.getStudentName());
	}
}
