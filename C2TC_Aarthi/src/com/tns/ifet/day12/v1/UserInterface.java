package com.tns.ifet.day12.v1;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayOperations obj= new ArrayOperations(new int[] {2,4,5,6});
			obj.displayArray();
			System.out.println("The element is: "+obj.getElement(2));
			System.out.println("The element is: "+obj.getElement(10));
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("Error!..."+ ae.getMessage());
		}
	}

}
