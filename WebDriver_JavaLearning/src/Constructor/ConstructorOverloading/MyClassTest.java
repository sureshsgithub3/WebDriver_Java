package Constructor.ConstructorOverloading;

public class MyClassTest {

	public static void main(String[] args) {
		Bike b= new Bike();
		System.out.println(b.id +" "+b.model+" "+b.maker);
		//calling constructor overloading
		Bike b1= new Bike(1256, "R15", "Yamaha");
		System.out.println(b1.id +" "+b1.model+" "+b1.maker);
		
				

	}

}
