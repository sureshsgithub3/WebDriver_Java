package Collections_ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectiontest {

	public static void main(String[] args) {
		Student s1= new Student(1, "Dcruz");
		Student s2= new Student(2, "Bhatia");
		Student s3= new Student(3, "Dcruz");
		
		
		ArrayList<Student> al= new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Student> itr= al.iterator();
		while(itr.hasNext()){
		Student st= (Student)itr.next();
		System.out.println(st.id+" "+st.name);

	}

}
}