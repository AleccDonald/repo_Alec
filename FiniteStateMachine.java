import java.util.*;

public class FiniteStateMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		String i = sc.nextLine();
		String id = sc.nextLine();
		
		String digits = new String("0123456789");
		int state = 0;
		
		if (i.length() != 6) {
			System.out.println("Please enter an ID that is 6 digits long:");
			i = sc.nextLine();
		}
		else {
		}
		
		int j;
		for (j = 1; j <= 1; j++) {
			
		for ( int ind = 0; ind < i.length(); ind++)
		{
			if (state == 0)
			{
				if(digits.indexOf(i.charAt(ind)) == 8)
					state = 1;
			}
			else if (state == 1)
			{
				if(digits.indexOf(i.charAt(ind)) == 9)
						state = 2;
				else 
					state = 0;
			}
			else if (state == 2)
			{
				if(digits.indexOf(i.charAt(ind)) == 7)
					state = 3;
				else
					state = 0;
			}
			else if (state == 3)
			{
				if(digits.indexOf(i.charAt(ind)) == 6)
					state = 4;
				else 
					state = 0;
			}
			else if (state == 4) 
			{
				if(digits.indexOf(i.charAt(ind)) == 2)
					state = 5;
				else
					state = 0;
			}
			else if (state == 5)
			{
				if(digits.indexOf(i.charAt(ind)) == 1)
					state = 5;
				else if (digits.indexOf(i.charAt(ind)) == 4)
						state = 6;
				else 
					state = 0;
			}
		} //end for looping
		if (state == 5)
			System.out.print("Final State is Unlocked");
		else
			System.out.print("Final State is Locked");
		}
		
}
}
