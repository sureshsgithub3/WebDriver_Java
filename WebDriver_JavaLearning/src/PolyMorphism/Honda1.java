package PolyMorphism;

public class Honda1 extends Bike1 {
	
	void run(){
		System.out.println("CBr 150 Running smo..thly....");
	}
	
	public static void main(String[] args){
		// an overridden method is called through the reference variable of a superclass.
		Bike1 obj= new Honda1();
		obj.run();
		
	}

}
