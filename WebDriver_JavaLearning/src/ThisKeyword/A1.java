package ThisKeyword;

public class A1 {
	int id;
	String name;
	
	//this can be used to refer the current class instance variable
	
	A1(int id, String name){
		this.id=id;
		this.name=name;
		
	}
    
	void diplay(){
		System.out.println("id :"+id+"   name: "+name);
	}
	public static void main(String[] args) {
		A1 a= new A1(1, "simmons");
		a.diplay();
		
		

	}

}
