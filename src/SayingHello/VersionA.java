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

public class VersionA
{

	public static void main(String[] args)
	{
		String name;
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = s.nextLine();
		
		System.out.println("Greetings, " + name + "!");
	}

}
