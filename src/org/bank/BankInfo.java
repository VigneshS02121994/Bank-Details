package org.bank;

public class BankInfo extends AxisBank {
	public void savings() {
		System.out.println("savings");
	}
	public void fixed() {
		System.out.println("fixed");
	}
	public static void main(String[] args) {
		BankInfo l = new BankInfo();
		l.savings();
		l.fixed();
		l.deposit();
		}
}
