import java.util.Scanner;
public class logic {

	public static void main(String[] args) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter te value");
		value = sc.nextInt();
		if((value>=10) && (value% 2 == 0))
		{
			System.out.println("value.10 and even");
					
		}
		else
		{
			System.out.println("condition not met");
		}
	
		
	}
	
}
