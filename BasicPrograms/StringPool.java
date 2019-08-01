
public class StringPool {

	static void pool(){
		System.out.println("Inside String Pool");
		String s1 = "hello";
		String s2= "hel" + "lo";
		String s3= "hello".intern();
		String s4 = new String("hello");
		final String s5 = "lo"; //final keyword hardcodes variable with value at compile time
		
		System.out.println("s1==s2: " + (s1==s2));
		
		System.out.println("s1==s3: " + (s1==s3));
		System.out.println("s1==s4: " + (s1==s4));
		System.out.println("s1==s4: " + (s1==s4.intern()));
		System.out.println("s1==hel+lo: " + (s1=="hel"+"lo"));
		System.out.println("s1==s5: " + (s1=="hel"+s5));
		//System.out.println("s1==s2" + (s1==s2));
		
	}
	public static void main(String[] args){
		pool();
		String z ="hel";
		z="789";
		int i =10;
		
	}
}
