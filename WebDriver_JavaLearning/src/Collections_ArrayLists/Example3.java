package Collections_ArrayLists;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("WebDriver");
		al.add("Grid");
		al.add("Selenium");//arraylist can duplicate values
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}

	}

}
