import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Random rand = new Random ();
	int one [] = new int [20];
	int two = 1 + rand.nextInt(10);
	int three = 0;
	int a;
	int b;
	int c;
	for(int i = 0; i < 20; i++){
	one[i] = 1 + rand.nextInt(10);
	}
	System.out.println("20 numbers: ");
	for(int i = 0; i < 20; i++){
	System.out.println(one[i] + " ");
	}
	System.out.println("Random number: " + two);
	for(int i = 0; i < 20; i++){
	if(one[i]==two){
	three++;
	a=1;
	System.out.println("Duplicate at: " + two);
	}
	}
	System.out.println("Total number of duplicates for " + two + " : " + three);
	for(int i = 1; i < 20; i++){
	b = one[i];
	c = one[i-1];
	if(b==c){
	System.out.println("Two in a row at: " + (i-1) + " and " + i + ".");
	System.out.println("Number: " + c);
	}
	}
	
	}
}
