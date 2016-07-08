package ThisKeyword;

public class A4 {
	
	void m(A4 a){
		System.out.println("Method m");
	}
	void n(){
		//this keyword can be argument to method
		m(this);
	}

	public static void main(String[] args) {
		A4 a= new A4();
	    a.n();
		

	}

}
