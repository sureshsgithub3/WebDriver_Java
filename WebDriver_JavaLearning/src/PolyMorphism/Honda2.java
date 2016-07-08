package PolyMorphism;

public class Honda2 extends Bike2 {
	 int speed=200;

	public static void main(String[] args) {
		Bike2 obj= new Honda2();
		// Runtime polymorphism can't be achieved by data members.
		System.out.println(obj.speed);

	}

}
