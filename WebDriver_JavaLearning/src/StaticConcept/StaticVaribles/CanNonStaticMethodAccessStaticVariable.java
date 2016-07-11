package StaticConcept.StaticVaribles;

public class CanNonStaticMethodAccessStaticVariable {
	
	int id;
	String name;
	//static variable initialized
	static String college="Gitam";
	
	
   //get and set methods for id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//get and set methods for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void change(){
		//changing value of static variable in non static method
		CanNonStaticMethodAccessStaticVariable.college="KLU";
	}
	public static void main(String[] args) {
		
		CanNonStaticMethodAccessStaticVariable obj= new CanNonStaticMethodAccessStaticVariable();
		obj.setId(1);
		obj.setName("abhi");
		obj.change();
		System.out.println(obj.id+"  "+obj.name);
		//with instance of class static variables can called but shows warning 
		//like below
		System.out.println(obj.college);//showing warning
		
		System.out.println(CanNonStaticMethodAccessStaticVariable.college);
		

	}

}
