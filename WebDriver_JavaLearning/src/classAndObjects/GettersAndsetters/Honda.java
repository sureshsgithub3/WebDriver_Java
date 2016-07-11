package classAndObjects.GettersAndsetters;

public class Honda {

	public static void main(String[] args) {
		
		Bike1 b= new Bike1();
		b.setid(1234);
		b.setMaker("Honda");
		b.setmodel("Cbr250");
		System.out.println(b.getid());
		System.out.println(b.getmodel());
		System.out.println(b.getmaker());

	}

}
