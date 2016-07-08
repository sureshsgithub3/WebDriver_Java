package StaticConcept;

public class TestBank1 {

	public static void main(String[] args) {
		Bank1 b= new Bank1();
		b.name="hsbc";
		b.accountbalance=10000;
		
		b.intersertwithaccountbalance(2000);
		System.out.println(b.accountbalance);
		
	   b.mem=new Members1();
	   b.mem.mem_Address="100 lane ,james park street,london";
		b.mem.mem_name="Mark";
		b.getbalance().deposit();
	   
	
		
		//Members1 m1=b.getbalance();
		//m1.deposit();
		//m1.withdrawl();
		//b.getbalance().deposit();
		//b.getbalance().withdrawl();
		
		
		
		

	}

}
