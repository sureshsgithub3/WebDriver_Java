package Abstractconcept;

public class TestAbstraction3 {
	
	public static void main(String[] args){
		Bike3 obj= new Honda3();
		obj.run();
		obj.geartype();
		
		Bike3 obj1= new Yamaha3();
		obj1.run();
		obj1.geartype();
	}

}
