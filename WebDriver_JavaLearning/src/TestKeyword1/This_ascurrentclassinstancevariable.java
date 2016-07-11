package TestKeyword1;

public class This_ascurrentclassinstancevariable {
	
	
	int id;
	String name;
	
	public void print(String name,int id){
		this.id=id;
		this.name=name;
		System.out.println("Student id : "+id);
		System.out.println("Student name :"+name);
	}

	public static void main(String[] args) {
		This_ascurrentclassinstancevariable obj = new This_ascurrentclassinstancevariable();
				obj.print("bhatia", 1);
		
		
		

	}

}
