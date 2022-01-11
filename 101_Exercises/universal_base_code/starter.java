import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Ascii one = new Ascii();
	one.printArt();
	Ascii two = new Ascii("Cactus");
	two.printArt();
	Ascii three = new Ascii("Other", 1);
	three.setAscii("!~~!**!~~!");
	three.printArt();
	Ascii four = new Ascii("Dog", "Heart", 1);
	four.printArt();
	Ascii a = new Ascii("Heart");
	a.printArt();

	}
}
