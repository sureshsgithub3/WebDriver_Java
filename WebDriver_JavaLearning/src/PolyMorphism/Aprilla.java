package PolyMorphism;

public class Aprilla extends Bike3 {
	
	void run(){
		System.out.println("S1 runs smoothlyyyyy.......");
	}
	//Java Runtime Polymorphism with Multilevel Inheritance

	public static void main(String[] args) {
		Bike3 obj1= new Honda3();
		Bike3 obj2= new Yamaha();
		Bike3 obj3= new Aprilla();
		
		obj1.run();
		obj2.run();
		obj3.run();
		
		

	}

}
