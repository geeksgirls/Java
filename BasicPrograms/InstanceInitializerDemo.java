
public class InstanceInitializerDemo {
	{
		System.out.println("Inside instance initializer");
	}
	
	public  InstanceInitializerDemo(){
		System.out.println("Inside no arg constructor");
	}
	
	public  InstanceInitializerDemo(int id){
		System.out.println("Inside constructor with a parameter");
	}
	
	public static void main(String[] args){
		InstanceInitializerDemo a = new InstanceInitializerDemo(9);
	}
}
