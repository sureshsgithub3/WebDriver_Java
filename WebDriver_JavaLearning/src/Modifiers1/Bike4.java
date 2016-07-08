package Modifiers1;

import Modifiers.Bike3;

public class Bike4 extends Bike3 {
        
	public static void main(String[] args) {
		
		Bike3 obj= new Bike3();
		obj.msg();//// since method msg() is default access modifier .it cannot be accessible out package  even classes have is-a relation ship
		

	}

}
