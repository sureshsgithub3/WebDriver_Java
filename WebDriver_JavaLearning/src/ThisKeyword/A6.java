package ThisKeyword;

public class A6 {
	int data=10;
	
	A6(){
		// this keyword can be argument to constructor
		B6 b= new B6(this);
		b.display();
	}

	public static void main(String[] args) {
		A6 a= new A6();

	}

}
