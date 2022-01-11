import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		
		System.out.println("What is your birthday month?");
		int month = sc.nextInt();
		String text2 = sc.nextLine();
		
		System.out.println("What is your birthday day?");
		int day = sc.nextInt();
		
		System.out.println("What is your birthday year?");
		int year = sc.nextInt();
		
		System.out.println("How much is a buck fifty?");
		double money = sc.nextDouble();
		String text = sc.nextLine();
		
	System.out.println("Your name is "+name+" and you were born on "+month+"/"+day+"/"+year+".");
	System.out.println("You are "+age+" years old.");
	System.out.print("A buck fifty is "+money+".");
	
		
	}
}
