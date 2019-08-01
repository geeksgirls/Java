
public class VarArgsOverload {
	int id;
	static void varargsOver(boolean flag, int j, int k, int l) {
		System.out.println("Inside method without Varargs parameter");
	}
	static void varargsOver(boolean flag, int... items) {
		System.out.println("Inside method with Varargs parameter");
		System.out.println("Length of list" + items.length);
		//int i = id;  cannot make static reference to non-static field
	}
	
	
	public static void main(String[] args) {
		varargsOver(true, 5,6,7);
		varargsOver(true, 5,6,7,8,9,9,7,6,0);
		varargsOver(true);
	}
}