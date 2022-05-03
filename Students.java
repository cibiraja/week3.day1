package week3.day1;

public class Students {
	public int getStudentsInfo(int id) {
		return id;
	}
	public void getStudentInfo(int id, String Name) {
		System.out.println("id is" + id);
		System.out.println("Name is" + Name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email is" +email);
		System.out.println("phone Number" + phoneNumber);
	}
	public static void main(String[]args) {
		Students student=new Students();
		int students=student.getStudentsInfo(1);
		student.getStudentInfo(7,"Cibi");
		student.getStudentInfo("456@3.com", 637460075);
	}
		
	}
	


