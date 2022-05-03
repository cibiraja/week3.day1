package week3.day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("student Name");
	}
	public void studentDept() {
		System.out.print("student Dept");
	}
    public void studentId() {
    	System.out.println("student Id");
    }
    public static void main(String[]args) {
    	College college=new College();
    	Department department=new Department();
    	Student student=new Student();
    	college.collegName();
    	college.collegeCode();
    	college.collegeRank();
    	department.deptName();
    	student.studentName();
    	student.studentDept();
    	student.studentId();
    }
    }

