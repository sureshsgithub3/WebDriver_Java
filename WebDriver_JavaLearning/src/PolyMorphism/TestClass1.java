package PolyMorphism;

public class TestClass1{

	public static void main(String[] args) {
		
		// an overridden method is called through the reference variable of a superclass.
		Bank1 obj1= new SBI1();
		Bank1 obj2= new ICICI1();
		Bank1 obj3= new HDFC1();
		
		System.out.println("SBI Interset:"+obj1.getintersetrate());
		System.out.println("ICICI interset:"+obj2.getintersetrate());
		System.out.println("HDFC interset :"+obj3.getintersetrate());


	}

}
