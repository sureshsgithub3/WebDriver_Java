package Constructor;

public class A1 {
	
	int data=20;
	
	A1 (){
		B1 b= new B1(this);
	}

	public static void main(String[] args) {
		A1 obj= new A1();
		
		

	}

}
