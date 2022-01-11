import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		String a = sc.nextLine();
		if (a.equals("Wizard"))
		{
			System.out.println("You've chosen to be a Wizard.");
		}
		else if (a.equals("Warrior"))
		{
			System.out.println("You've chosen to be a Warrior.");
		}
		else if (a.equals("Rogue"))
		{
			System.out.println("You've chosen to be a Rogue.");
		}
		else
		{
			System.out.println("You've decided not to choose a role from the given options. Run program again.");
		}
	}
}
