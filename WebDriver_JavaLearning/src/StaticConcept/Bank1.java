package StaticConcept;

public class Bank1 {
	String name;
	double accountbalance;
	Members1 mem;
	
	
	
	public double intersertwithaccountbalance(double interset){
		accountbalance=accountbalance+interset;
		return accountbalance;
	}
	
	
	public Members1 getbalance(){
		
		return mem;
	}

}
