import java.util.Scanner;
import java.util.Random;

class starter {
public static boolean checkPrime(int a)
{
	int x = a;
	int y = 2;
	while(y<a)
	{
		if(x%y ==0)
		{
			return false;
		}
		y=y+1;
	}
	
	return true;
	
}

public static void printPrimes(int b)
{
	int z = 2;
	while(z<=b)
	{
		if(checkPrime(z)){
			System.out.println(z);
		}
		z=z+1;
		if(b==z){
			break;
		}
	}
	return;
}

	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc = new Scanner(System.in);
	System.out.println("Input an integer.");
	int x = sc.nextInt();
	//System.out.println(printPrimes(x));
	printPrimes(x);
		
	}
}
