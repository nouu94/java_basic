package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.studentName = "������";
		System.out.println(student1.getStudentName());
		
		student2.studentName = "������";
		System.out.println(student2.getStudentName());
		
		student3.studentName = "��ö��";
		System.out.println(student3.getStudentName());
	}

}
