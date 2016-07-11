package Collections_ArrayLists;

import java.util.ArrayList;

public class AddAllMethod {

	public static void main(String[] args) {
ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("WebDriver");
		al.add("Grid");
		al.add("Selenium");//arraylist can duplicate values
		
		
				ArrayList<String>al1 = new ArrayList<String>();
				al1.add("Sikuli");
				al1.add("Datadriven");
				
				al.addAll(al1);
				
				
				for(String s:al){
					System.out.println(s);
	}

}
}
