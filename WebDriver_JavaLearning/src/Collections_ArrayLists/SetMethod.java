package Collections_ArrayLists;

import java.util.ArrayList;

public class SetMethod {

	public static void main(String[] args) {
ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("WebDriver");
		al.add("Grid");
		al.add("Selenium");//arraylist can duplicate values
		
		    for(String s:al){
		    	System.out.println(s);
		    }
		
		
				System.out.println("before set/update list :"+al.size());
				
				
				al.set(3, "Ant");//update existing element
				for(String s:al){
			    	System.out.println(s);
			    }
				
				System.out.println("after set/update list  :"+al.size());
		
	}

}
