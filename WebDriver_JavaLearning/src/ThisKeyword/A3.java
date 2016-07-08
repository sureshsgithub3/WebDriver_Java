package ThisKeyword;

public class A3 {
	
	void m(){
		System.out.println("Method m");
	}
	
	void n(){
		//this keyword is used to call method
		this.m();
	}
	
	void p(){
		n();
	}

	public static void main(String[] args) {
		A3 a= new A3();
		a.p();

	}

}
