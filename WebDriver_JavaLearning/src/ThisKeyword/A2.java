package ThisKeyword;

public class A2 {
	int id;
	String name;
	
	//this() can be used to invoked current class constructor.
	//The this() constructor call can be used to invoke the current class constructor (constructor chaining).
     //This approach is better if you have many constructors in the class and want to reuse that constructor.
	A2(int i,String n){
		this();//rule this call in constructor has to be first 
		id=i;
		name=n;
	}
	A2(){
		System.out.println("Default Constructor");
		
	}
	void diplay(){
		System.out.println("id :"+id+"   name: "+name);
	}

	public static void main(String[] args) {
		A2 a= new A2(1, "simmons");
		a.diplay();
		
	}

}
