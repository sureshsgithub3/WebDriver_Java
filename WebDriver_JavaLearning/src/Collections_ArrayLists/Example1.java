package Collections_ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;


public class Example1 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
		
		al.add("Selenium");
		al.add("WebDriver");
		al.add("Grid");
		al.add("Selenium");//arraylist can duplicate values
         
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
