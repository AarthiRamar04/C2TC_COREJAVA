package com.tns.ifet.day4.interfaces.instanceofinterfaces;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();

	}

}
