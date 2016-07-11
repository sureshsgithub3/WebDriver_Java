package StaticConcept.StaticRules;

public class Student {
	int id=10;
	
	public static void print(){
		//static method cannot call non static variables
		System.out.println(id);
	}
	public static void details(int id){
		//this cannot be used in static context.
		//because static methods are class level not in instance level
		this.id=id;
	}

	public static void main(String[] args) {
		Student.print();

	}

}
