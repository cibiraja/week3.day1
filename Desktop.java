package week3.day1;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("desktop size");
	}
	public static void main(String[]args) {
		Desktop desktop=new Desktop();
		Computer computer=new Computer();
		desktop.desktopsize();
		computer.computerModel();
	}
	

}
