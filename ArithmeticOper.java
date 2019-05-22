
public class ArithmeticOper {

	static void prepost() {
		System.out.println("Inside prepost:");
		int x = 5;
		
		//x++;
		
		//System.out.println("x:" + x);
		
		//int y = --x;
		//System.out.println("y:" + y + " x:" + x); 
		int index = -1;
		int[] array = new int[3];
		
		array[++index] = 10;
		// index++;
		array[++index] = 20;
		array[++index] = 30;
		System.out.println(index);
	}
	
	static void compoundArithmeticOperator(){
		int x = 100;
		System.out.println("x += 5 : " + (x+=5));
		System.out.println("x -= 5 : " + (x-=5));   // x= 105-5
		System.out.println("x *= 5 : " + (x*=5));  // x=100*5
		System.out.println("x /= 5 : " + (x/=5));  // x=500/5
		System.out.println("x %= 5 : " + (x%=5));
		
		/*//Invalid 
		System.out.println("x =+ 5 : " + (x =+ 5));  // Unary plus x= +5
		System.out.println("x =- 5 : " + (x=-5));   // Unary minus
		System.out.println("x =* 5 : " + (x=*5));  //compilation error 
		*/
		
	}

	static void charTypePromotion() {
		  System.out.println("\nInside charTypePromotion ...");
		  char char1 = 50; // Will be assigned corresponding UTF16 value 2
		  System.out.println("char1: " + char1); 
		  System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used	  
		  System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints	
		  System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
	    }
	public static void main(String[] args){
		prepost();
		compoundArithmeticOperator();
		charTypePromotion();
		int i = 'a';
		System.out.println(9*5-'a'/5.0);
	}
}
