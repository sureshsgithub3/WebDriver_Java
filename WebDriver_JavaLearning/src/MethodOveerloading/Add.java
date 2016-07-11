package MethodOveerloading;

public class Add {

	
	public void add(int a, int b){
		System.out.println(a+b);
		
	}
	
	//method overloading
	
	public void add(double a, double b){
		System.out.println(a+b);
	}
	public void add(String a ,String b){
		System.out.println(a+b);
	}
	
	

	public static void main(String[] args) {
		
		
		Add a= new  Add();
		a.add(1, 2);
		a.add(3000.99, 4000.99);
		a.add("selenium", "grid");
		

	}

}
