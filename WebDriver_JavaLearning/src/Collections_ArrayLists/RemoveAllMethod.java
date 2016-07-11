package Collections_ArrayLists;

import java.util.ArrayList;

public class RemoveAllMethod {

	public static void main(String[] args) {
ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");////arraylist can duplicate values
		al.add("WebDriver");
		al.add("Grid");
	
		
		
				ArrayList<String>al1 = new ArrayList<String>();
				al1.add("Selenium");
				al1.add("Sikuli");
				al1.add("Datadriven");
				
				al.removeAll(al1);
				
				
				for(String s:al){
					System.out.println(s);
	}

	}

}
