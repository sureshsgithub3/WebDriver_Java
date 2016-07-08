package StaticConcept;

public class Swap {
	
	// call by value and reference
	
	int a;
	int b;
	
	public static void swapnos(int c ,int d){//pass by value
		int temp=c;
		c=d;
		d=temp;
	}
	
	public static void swapons1(Swap sw){//pass by refernce
		int temp=sw.a;
		sw.a=sw.b;
		sw.b=temp;
	}

	public static void main(String[] args) {
		Swap s= new Swap();
		s.a=100;
		s.b=200;
		
		swapnos(s.a, s.b);
		
		System.out.println(s.a);
		System.out.println(s.b);
		Swap sw= new Swap();
		
		// result will be a=100 and b=200 same java doesnt support call by value
		
		sw.a=300;
		sw.b=400;
		swapons1(sw);
		
		System.out.println("Sw.a value is :"+sw.a);
		System.out.println("Sw.a value is :"+sw.b);
		
		

	}

}
