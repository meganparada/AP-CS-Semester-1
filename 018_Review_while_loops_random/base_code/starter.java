import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

Scanner sc = new Scanner(System.in);
Random rand = new Random();
System.out.println("Please input a guess between 1-1000.");
int guess = sc.nextInt();
int answer = 1 + rand.nextInt(1000);
while (true)
{
	if(guess==answer)
	{
	System.out.println("You guessed the correct number.");
	break;
	}
	else if (guess>answer)
	{
		System.out.println("Your guess is too high. Try again.");
		guess = sc.nextInt();
	}
	else
	{
		System.out.println("Your guess is too low. Try again.");
		guess = sc.nextInt();
	}
}

}
}
