package Modifiers1;

import Modifiers.Bike1;

public class Bike2 {

	public static void main(String[] args) {
		Bike1 obj= new Bike1();
		obj.msg();// since method msg() is default access modifier .it cannot be accessible out package 

	}

}
