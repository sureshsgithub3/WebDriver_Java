package Collections_ArrayLists;

import java.util.ArrayList;

public class Removemethod {

	public static void main(String[] args) {
ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("WebDriver");
		al.add("Grid");
		al.add("Selenium");//arraylist can duplicate values
		
		    for(String s:al){
		    	System.out.println(s);
		    }
		
		
				System.out.println("before remove :"+al.size());
				
				
				al.remove(2);// remove element at index2
				for(String s:al){
			    	System.out.println(s);
			    }
				
				System.out.println("after remove :"+al.size());
		
		
	

	}

}
