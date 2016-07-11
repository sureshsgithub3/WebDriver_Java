package Collections_ArrayLists;

import java.util.ArrayList;

public class HetrogenousInsertions {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add("selenium");
		al.add(2);
		al.add("String");
		al.add(null);
		
		System.out.println(al);//this will gives output like below
		//[selenium, 2, String, null]
		
		
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
			
		}

	}

}
