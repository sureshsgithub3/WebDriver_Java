package Modifiers1;

import Modifiers.Bike5;

public class Bike6 {

	public static void main(String[] args) {
		Bike5 obj= new Bike5();
		obj.msg();// since method msg() is protected access modifier .it cannot be accessible out of package 

	}

}
