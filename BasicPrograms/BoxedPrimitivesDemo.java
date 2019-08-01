
public class BoxedPrimitivesDemo {

	public static void comparePrimitives() {
		System.out.println("Inside Box Primitives");
		Integer num1 = new Integer(0);
		Integer num2 = new Integer(0);

		System.out.println("num1==num2" + (num1 == num2));

		// Solutions
		System.out.println("num1==num2 with intValue()" + (num1.intValue() == num2.intValue()));
		System.out.println("num1==num2 with equals()" + num1.equals(num2));
		Integer num3 = new Integer(1);
		System.out.println("num1<num3" + (num1 < num3));
	}

	public static void veryExpensive() {
		long sum = 0L;
		// Long sum =0L;
		System.out.println("Inside Primitive Block");
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}

	}

	public static void main(String[] args) {
		long start = System.nanoTime();
		//veryExpensive();
		System.out.println("Elapsed time:" + (System.nanoTime() - start) / 100000 + "msec");
		comparePrimitives();
	}
}
