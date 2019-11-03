package CountingCharacters;

import java.util.Scanner;

/**
  * DESCRIPTION
  * Create a program that prompts for an input string and displays output that shows
  * the input string and number of characters the string contains.
  *
  * CONSTRAINTS
  *     - Be sure that the output contains the original string.
  *     - Use a single output statement to construct the output.
  *     - Use a built-in function of the programming language to determine the
  *       length of the string.
  *
  * CHALLENGES
  *     - If the user enters nothing, state that the user must enter something into the program.
  *     - Implement this program using a graphical user interface (if possible) and update the
  *       character every time the key is pressed.
  */

public class VersionA
{

    public static void main(String[] args)
    {

        String string;
        int count;
        Scanner s = new Scanner(System.in);

        System.out.println("Type your string here:");
        string = s.nextLine().toUpperCase();
        count = string.length();

        if (count == 0)
        {
            System.out.println("Must enter at least one character!");
        }
        else
        {
            System.out.println(string + " (" + count + " characters)");
        }

    }

}
