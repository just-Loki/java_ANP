
public class Increment {
	
	public static void main(String[] args) {
		int a=10,b=a;
		b=++a;//pre increment
		
		System.out.println("pre incr:a="+a +"b="+b);
		
		//now a value is 11
		
		b=a++;//post increment
		System.out.println("post incr:a="+a+"b="+b);

	}

}
