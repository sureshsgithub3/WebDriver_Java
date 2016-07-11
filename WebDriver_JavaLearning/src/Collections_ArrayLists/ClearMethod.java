package Collections_ArrayLists;

import java.util.ArrayList;

public class ClearMethod {

	public static void main(String[] args) {
ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("WebDriver");
		al.add("Grid");
		al.add("Selenium");//arraylist can duplicate values
		
		    for(String s:al){
		    	System.out.println(s);
		    }
		
		
				System.out.println("before clear :"+al.size());
				
				
				al.clear();//clears all elements in list
				for(String s:al){
			    	System.out.println(s);
			    }
				
				System.out.println("after clear :"+al.size());
		

	}

}
