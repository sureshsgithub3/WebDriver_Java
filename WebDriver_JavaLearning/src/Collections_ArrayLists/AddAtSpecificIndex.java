package Collections_ArrayLists;

import java.util.ArrayList;

public class AddAtSpecificIndex {
	
	
	
	

	public static void main(String[] args) {
		
		
ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("WebDriver");
		al.add("Grid");
		al.add("Selenium");//arraylist can duplicate values
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
			
		}
		
		System.out.println("after insertion");
		
		al.add(1, "Selenium2");
		
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
			
		}

		

	}

}
