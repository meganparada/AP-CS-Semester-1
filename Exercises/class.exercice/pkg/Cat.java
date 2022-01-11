package pkg;
import java.util.Scanner;
import java.util.Random;

public class Cat{
	String name;
	public Cat(){
		name = "Garfield";
	}
	public Cat(String name2){
	name = name2;
	}
	
	public void meow(){
		System.out.println(name + " meows.");
		return;
	}
}