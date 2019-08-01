
public class ForLoop {
	public static void main(String[] args) {
		
		int[] iArr = {0, 1,2,3,4,5,6,7,8,9};
		int temp;
		//for(int i=0, j = iArr.length-1; i<j; i++, j--) {  // condition is same for even or odd no. of elements 
			//i<iArr.length/2
		for(int i=0, j = iArr.length-1; i< iArr.length >>> 1; i++, j--) {
				temp = iArr[i];
				iArr[i] = iArr[j];
				iArr[j] = temp;
				
			
		
		}
		for(int i =0; i< iArr.length;i++) {
			System.out.println(iArr[i]);
		}
	}
}
