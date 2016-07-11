package TestKeyword1;

public class Student1 {
	int id;
	String name;
	
	Student1(){
		System.out.println("default constructor invoked");
	}
	
	Student1(int id , String name){
		//this can be used to invoke current class constructor
		//this statement must be 1st statement in the block
		
		
		this();
		this.id=id;
		this.name=name;
		
	}
	
	

	public static void main(String[] args) {
		

	}

}
