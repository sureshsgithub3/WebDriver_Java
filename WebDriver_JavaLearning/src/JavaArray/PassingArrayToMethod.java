package JavaArray;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		
		String[] names= new String[2];
		names[0]="osama";
		names[1]="laden";
		
		printarray(names);

	}

	private static void printarray(String[] names) {
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
	}

}
