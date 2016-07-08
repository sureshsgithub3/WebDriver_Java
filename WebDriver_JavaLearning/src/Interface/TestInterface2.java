package Interface;

public class TestInterface2 implements Car2,Bike2 {

	public static void main(String[] args) {
		
		TestInterface2 obj= new TestInterface2();
		obj.Type();
		obj.geartype();
		obj.biketype();
		

	}

	@Override
	public void Type() {
		System.out.println("Vehical type");
		
		
	}

	@Override
	public void geartype() {
		System.out.println("Car gear type: auto");
		
		
	}

	@Override
	public void biketype() {
		System.out.println("Bike Type");
		
		
	}

}
