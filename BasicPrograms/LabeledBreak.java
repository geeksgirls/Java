
public class LabeledBreak {

	public static void main(String[] args) {
		int num =0;
		
		outermost:for(int i =0; i<10;i++) {
			for(int j =0; j<10;j++) {
				if(i==5 && j==5) {
					break outermost;
				}
				num++;
			}
		}
		
		System.out.println("num: " + num);
	}
}
