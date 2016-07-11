package ModifiersAccess1;

import AccessModifiers.ProtectedAccess.StudentProtected;

public class ProtectedStudentExam extends StudentProtected {

	public static void main(String[] args) {
		
		StudentProtected s= new StudentProtected();
		
		//protected class properties cannot be accessed out of package
	
	}

}
