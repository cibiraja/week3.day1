package week3.day1;

public class Automation implements Language,TestTool {
	private int num;
	private String name;
	public void java() {
		System.out.println("Java is easy to learn");
	}
	public void selenium() {
		System.out.println("Selenium is also easy to learn");
	}
	public String getName(String name) {
		return name;
	}
	public Automation(String name, int num) {
		this.name=name;
		this.num=num;
		System.out.println("Name is" + name+"and the num is" +num);
	}
	public static void main(String[]args) {
		Automation an=new Automation("Testing",678);
		an.java();
		an.selenium();
		System.out.println("Id is" +id);
	}
	

}
