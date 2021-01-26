package classpart;

public class Student {
	int studentID; //학번 멤버변수1
	String studentName; //학생 이름 멤버변수2
	int grade; //학년 멤버변수3
	String adress; //사는 곳 멤버변수4
	
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
		studentChoi.studentName = "최현제";
		
		System.out.println(studentChoi.studentName);
		System.out.println(studentChoi.getStudentName());
	}
}
