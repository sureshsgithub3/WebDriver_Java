package Constructor.ConstructorOverloading;

public class Bike {
	
	int id;
	String model;
	String maker;
	//constructor never returns value
	
	Bike(){
		id=1234;
		model="cbr250";
		maker="honda";
	}
	//constructor overloading
	
	Bike(int i,String m1,String mkr){
		id=i;
		model=m1;
		maker=mkr;
	}

}
