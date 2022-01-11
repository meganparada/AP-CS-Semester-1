import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int multiply(int a, int b){
			int x = a;
			int y = b;
			int ans = x*y;
			int fail = 0;
		if(ans%3 == 0){
			System.out.println(ans);
			return ans;
		}
		else{
			System.out.println("The product is not divisible by 3.");
		}
		return fail;
		}
	
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integer.");
		int a = sc.nextInt();
		System.out.println("Please input another integer.");
		int b = sc.nextInt();
		multiply(a,b);
	}
}
