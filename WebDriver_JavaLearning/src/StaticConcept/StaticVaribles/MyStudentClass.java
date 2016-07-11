package StaticConcept.StaticVaribles;

public class MyStudentClass {

	public static void main(String[] args) {
		Student s= new Student();
		s.setid(1);
		s.setname("rama");
		System.out.println(s.getid()+" "+s.getname());
		
		Student s1= new Student();
		s1.setid(2);
		s1.setname("sita");
		System.out.println(s1.getid()+" "+s1.getname());
		System.out.println(Student.studentcount);

	}

}
