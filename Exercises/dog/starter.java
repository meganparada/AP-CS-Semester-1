import java.util.Scanner;
import java.util.Random;

class Dog {
	String name;
	int age;
	String breed;
	
	public Dog (){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		age = 1;
		breed = b;
	}
	public Dog(String a, int c){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
		return;
	}
	public void setAge(int c){
		age = c;
		return;
	}
	public void setBreed(String b){
		breed = b;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public static boolean isSleeping(){
		Random rand = new Random();
		int x = rand.nextInt(2);
		if (x==0)
		{
			return true;
		}
		else if (x==1)
		{
			return false;
		}
		return false;
	}
	public void bark(){
		System.out.println(name + " barks.");
		return;
	}
}
	
class starter{
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Name the dog.");
		String a = sc.nextLine();
		System.out.println("How old is " +a+ "?");
		int c = sc.nextInt();
		Dog one = new Dog(a,c);
		Dog two = new Dog("Doggo", "Yorkie");
		boolean test = one.isSleeping();
		boolean test2 = two.isSleeping();
		System.out.println(one.getName() + " is a " + one.getBreed() + " that is " + one.getAge() + " year(s) old.");
		System.out.println(two.getName() + " is a " + two.getBreed() + " that is " + two.getAge() + " year(s) old.");
		if(test==true)
		{
			System.out.println(a + " is sleeping.");
		}
		else if(test ==false)
		{
			System.out.println(a + " is awake.");
			one.bark();
		}
		if(test2==true && test==false)
		{
			System.out.println("Doggo is sleeping and hears " +a+ ".");
			two.bark();
		}
		if(test2==false && test==false)
		{
			System.out.println("Doggo is awake and hears " +a+ ".");
			two.bark();
		}
		else if(test2==false && test==true)
		{
			System.out.println("Doggo is awake.");
		}
	}
}