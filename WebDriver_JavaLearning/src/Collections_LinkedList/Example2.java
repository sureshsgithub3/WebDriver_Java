package Collections_LinkedList;

import java.util.LinkedList;

public class Example2 {
	//in linked list also values can be duplicated
		//but difference list manipulation can be fast
	    //but it uses double linked list and extends abstractlist and implements list interface


	public static void main(String[] args) {
		LinkedList<String> li= new LinkedList<String>();
		li.add("Selenium");
		li.add("WebDriver");
		li.add("Grid");
		li.add("Selenium");

		
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i));
		}
	}

}
