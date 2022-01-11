import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

	public static void main (String args[ ]){
	int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
	int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
	int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
	int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
	int [ ] arr5 = {1, 2, 3, 4, 5, 6};
	
	int mode1 = getMode(arr1);		//The value of mode1 is 5.
	int mode2 = getMode(arr2);		//The value of mode2 is 7
	int mode3 = getMode(arr3);		// The value of mode3 is -1.
	int mode4 = getMode(arr4);
	int mode5 = getMode(arr5);
	
	int median1 = getMedian(arr1);  	//The value of median1 is 4.
	int median2 = getMedian(arr2);		//The value of median2 is 3.
	int median3 = getMedian(arr3);
	int median4 = getMedian(arr4);
	int median5 = getMedian(arr5);
}
	public static int [] getMode(int[] arr1){
		if(array.length>0){
		System.out.println("The value of the mode is:" + int mode1);
		return mode1;
		}
		else{
		System.out.println("-1");
		}
			
		}
	}
	
	public static int [] getMedian(int[] arr1){
		if(array.length>0){
		return median1;}
	}
	}
}





public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has
	
	String generateWord = new String ()//Empty Constructor
		int numTries = 5;// Your code goes here
	public int (int numTries)//Integer Constructor
		// Your code goes here
	public int guessFirst(String, int);
	public boolean checkWin(boolean[]);
	// GIVEN - meaning you can use this, assume it works.
	// @return nothing
	// This method sets your guessingWord to a pre generated lowercase word.
	// This method  is the same as indexOf so no using indexOf.
	public void generateWord(){
		/* implementation not shown */
	}
	
	/** Returns the index of the FIRST same letter in the guessedWord
	 *  @param letter a letter guessed by the user
	 *  @param start, the starting of index of where in the word to start checking
	 *		Preconditions: Assume letter is one single character and lowercase.
	 *	 			Assume start >= 0
	 *  @return index of first same occurrence of letter, returns -1 if no occurrence found.
	 */
	public int guessCheck(String letter, int start){
		// Your code goes here	
	}
	
	/** Returns true if all booleans in the array are true, false otherwise.
	 *  The purpose of this is to check if all letters have been guessed.
	 *	@param boolean array will have true or false values of guessed letters.
	 *		Precondition: arr.length > 0
	 *  @return true if all values are true, false if one or more are false.
	 */
	public boolean checkWin(boolean [] arr){
		// Your code goes here
	}
}


//Ran out of time for FRQs, too long on MC and Feedback Survey:(