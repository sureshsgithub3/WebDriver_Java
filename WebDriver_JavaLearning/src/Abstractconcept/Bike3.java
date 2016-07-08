package Abstractconcept;
//Rule: If there is any abstract method in a class, that class must be abstract.
public abstract class Bike3 {
	
	public Bike3() {
		System.out.println("Bike created :");
		
	}
	
	abstract void run();
	
	void geartype(){
		System.out.println("Manual :");
	}
	
	
	

}
