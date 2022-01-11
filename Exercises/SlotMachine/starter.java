import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

Scanner sc = new Scanner(System.in);
Random rand = new Random();
System.out.println("Slot Machine Rules below, please read:");
System.out.println("1) Each player starts with $100.");
System.out.println("2) Input a wager less than your total amount of money.");
System.out.println("3) The slot machine will roll 3 numbers from 1 to 10.");
System.out.println("      - If two numbers match, your money is doubled.");
System.out.println("      - If three numbers match, your money is tripled.");
System.out.println("      - If no numbers match, your money is lost.");

int x = 100;
while(x>0){
	System.out.println("Would you like to play the slots?");
	String y = sc.nextLine();
	if((a.equals("Yes")) || (a.equals("yes")) || (a.equals("Y")) || (a.equals("y")))
	{
		System.out.println("You have $" +x+ ". How much would you like to wager?");
		int z = sc.nextInt();
		sc.nextLine();
		int one = 1 + rand.nextInt(10);
		int two = 1 + rand.nextInt(10);
		int three = 1 + rand.nextInt(10);
		System.out.println(one + " | " + two + " | " + three);
			if(((one==two) || (two==three) && (one!=three)) || ((one==two) || (one==three) && (two!=three)) || ((one==three) || (two==three) && (one!=two)))
			{
				x = x + z;
				System.out.println("You won! Your wager is doubled.");
				System.out.println("You now have $" +x);
			}
			else if((one==two) && (two==three))
			{
				x = x + (2*z);
				System.out.println("You won! Your wager is tripled.");
				System.out.println("You now have $" +x);
			}
			else
			{
				x = x - z;
				System.out.println("Unfortunately, you did not win. Better luck next time!");
				System.out.println("You now have $" +x);
			}
			
	}
	
	else if((a.equals("No")) || (a.equals("no")) || (a.equals("N")) || (a.equals("n")))
	{
		System.out.println("Sorry to see you do not want to play today. Come again soon!");
		break;
	}
	else if(c<=0)
	{
		System.out.println("You do not have any money left.");
		{
			break;
		}
	}
	else
	{
		System.out.println("That wasn't the correct answer. Try again.");
	}
}
}
