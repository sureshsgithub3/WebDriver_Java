package Abstractconcept;

public class Honda1 extends Bike1 {
	
	//implements Run method of parent class
	void run(){
		System.out.println("Running smoooothly..");
	}

	public static void main(String[] args) {
		
		//It needs to be extended and its method implemented. It cannot be instantiated
		Bike1 obj= new Honda1();
		obj.run();
		

	}

}
