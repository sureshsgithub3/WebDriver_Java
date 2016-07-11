package StaticConcept.StaticVaribles;

public class Student {
	
	int id ;
	String name;
	
	static int studentcount;
	
	
	Student(){
		studentcount++;
	}
	
	
	public void setid(int id){
		this.id=id;
		
	}
	
	public int getid(){
		return id;
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public String getname(){
		return name;
	}

}
