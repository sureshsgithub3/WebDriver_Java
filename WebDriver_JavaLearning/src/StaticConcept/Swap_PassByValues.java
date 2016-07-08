package StaticConcept;

public class Swap_PassByValues {
	
	int a ;
	int b;
	
	public static void swap(int c, int d)//pass by values
	{
		int temp=c;
		c=d;
		d=temp;
	}
	public static void main(String[] args) {
		Swap_PassByValues obj= new Swap_PassByValues();
		obj.a=100;
		obj.b=200;
		swap(obj.a, obj.b);//pass by values
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
