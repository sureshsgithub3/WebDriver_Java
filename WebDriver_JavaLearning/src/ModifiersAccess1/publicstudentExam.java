package ModifiersAccess1;

import AccessModifiers.PublicAccess.Studentpublic;

public class publicstudentExam  extends Studentpublic{

	public static void main(String[] args) {
		Studentpublic s= new Studentpublic();
		s.setId(1);
		s.setName("suresh");
		System.out.println(s.getId());
		System.out.println(s.getName());
		
		

	}

}
