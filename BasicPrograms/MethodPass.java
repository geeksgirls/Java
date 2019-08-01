
public class MethodPass {
	
	int id;
	static void updateID(MethodPass s1) {
		s1.id = 1001;
	}
	
	public static void main(String[] args) {
		/*int id = 1000;
		updateID(id);
		System.out.println(id);*/
		
		MethodPass s = new MethodPass();
		s.id = 1000;
		updateID(s);
		System.out.println(s.id);
	
		
		
	}
}
