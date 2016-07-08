package Interface;

public class TestInterface1 implements Car1,Bike1 {
	
	//Multiple inheritance is possible in interfaces
	public void geartype() {
		System.out.println("Auto");
		
	}


	
	public void bikegeartype() {
		System.out.println("Manual");
		
	}
	

	public static void main(String[] args) {
		TestInterface1 obj= new TestInterface1();
		obj.geartype();
		obj.bikegeartype();
		

	}

	
	
	
	
}
