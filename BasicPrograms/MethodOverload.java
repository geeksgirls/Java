
public class MethodOverload {
	static void go(int[] array) {
		System.out.println("array[0]:" + array[0]);
		System.out.println("array[1]:" + array[1]);
		
	}
	static void go(int i) {
		System.out.println(" go (int method)");
	}
	
	/**
	 * 
	 * @param s
	 */
	static void go(short s) {
		System.out.println(" go (short method)");
	}
	public static void main(String[] args) {
		int[] array = {1,2};
		go(array);
		go(1000);
		byte b = 22;
		go(b);
		
		
	}
}
