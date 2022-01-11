import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		

	
Scanner sc = new Scanner(System.in);
System.out.println("Input an integer.");
int y = sc.nextInt();
int ans = y-1;
while(true)
{
	y = y * ans;
	if (ans==0)
	{
		break;
	}
	ans = ans-1;
	System.out.println(y);
	} 
	}
}


//  Compile - javac starter.java
// Run - java starter



