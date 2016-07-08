package JavaArray;

public class MethodreturnsArray {
	
	public String[] Arraymethod(){
		String[] names=new String[3];
		names[1]="bin";
		names[0]="osama";
		names[2]="laden";
		
		return names;
	}
	
	public void printarray(String[] tags){
		for(int i=0;i<tags.length;i++){
			System.out.println(tags[i]);
		}
	}
	
	public static void main(String[] args){
		
		MethodreturnsArray obj= new MethodreturnsArray();
		String[] tags= obj.Arraymethod();
		obj.printarray(tags);
		
	}

}
