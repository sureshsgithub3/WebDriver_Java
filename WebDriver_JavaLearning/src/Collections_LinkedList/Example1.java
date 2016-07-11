package Collections_LinkedList;

import java.util.LinkedList;

public class Example1 {
	//in linked list also values can be duplicated
	//but difference list manipulation can be fast

	public static void main(String[] args) {
		LinkedList<String> li= new LinkedList<String>();
		li.add("Selenium");
		li.add("WebDriver");
		li.add("Grid");
		li.add("Selenium");
		
		for(String s:li){
			System.out.println(s);
		}

	}

}
