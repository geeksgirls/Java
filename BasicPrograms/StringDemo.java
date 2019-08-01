
public class StringDemo {
	public static void main(String[] args){
		String s = "hello" + " world!";
		System.out.println("s:" +  s);
		
		StringBuilder sb = new StringBuilder(s);
		sb.append("Good").append(" morning");
		System.out.println("sb:" +  sb.toString());
		System.out.println("sb.length:" +  sb.length());
		
		
		sb.delete(1,5);
		System.out.println("sb:" +  sb.toString());
		System.out.println("sb.length:" +  sb.length());
		
		sb.insert(1, "ey");
		System.out.println("sb:" +  sb.toString());
		System.out.println("sb.length:" +  sb.length());
		
		
		
		sb.replace(4,9,"WORLD");
		System.out.println("sb:" +  sb.toString());
	}
}
