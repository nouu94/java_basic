package classpart;

public class Man {
	int age;
	String name;
	boolean isMarried;
	int children;
	
	public int getManAge() {
		return age;
	}
	
	public void setManAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Man man1 = new Man();
		
		man1.name = "James";
		man1.age = 40;
		man1.isMarried = true;
		man1.children = 3;
		
		System.out.println(man1.getManAge());
		System.out.println(man1);
	}
}
