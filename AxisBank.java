package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit(){
		System.out.println("deposite money");
	}
	public static void main(String[]args) {
		BankInfo bankinfo=new BankInfo();
		AxisBank axisbank=new AxisBank();
		bankinfo.saving();
		bankinfo.fixed();
		bankinfo.deposit();
		axisbank.deposit();
		
		
	}

}
