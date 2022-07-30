package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("axisdep");
	}
public static void main(String[] args) {
	AxisBank b =new AxisBank();
	b.fixed();
	b.saving();
	b.deposit();
}
}
