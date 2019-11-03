package SayingHello;

/**
 * DESCRIPTION
 * Create a program that prompts for your name and prints a greeting using your name.
 *
 * CONSTRAINTS
 * 		- keep the input, string concatenation and output separate.
 *
 * CHALLENGES
 *		- Write a new version (VersionB Class) of the program without using any variables
 *		- Write a new version (VersionC Class) of the program that displays different
 *		  greetings for different people.
 */

import java.util.Scanner;

public class VersionB
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		// Name is incorporated into output - no variables stored
		System.out.println("Greetings, " + s.nextLine() + "!");
	}

}
