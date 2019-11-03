package CountingCharacters;

import javax.swing.*;
import java.awt.*;

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

/**
 * INCOMPLETE
 *      - Program does not run properly - no errors, but no GUI nor functionality visibly present
 */

public class VersionB extends JFrame
{

    // GLOBAL variables - elements in the GUI
    private static JButton button = new JButton("Continue");
    private static JTextField inputField = new JTextField(15);
    private static JLabel outputLabel = new JLabel();


    public static void main(String[] args)
    {

        // Run GUI vesion of the program
        new VersionB();

    }


    // GUI-implemented program
    public VersionB()
    {
        // Provide a layout for the GUI
        setLayout(new BorderLayout());

        // Ensure the label is initially invisible
        outputLabel.setVisible(false);

        // Apply GUI elements to container
        Container container = getContentPane();
        container.add(inputField, BorderLayout.NORTH);
        container.add(button, BorderLayout.CENTER);
        container.add(outputLabel, BorderLayout.SOUTH);

        // Add event listener to run the program when user clicks a button
        VersionB.button.addActionListener(e -> {

            // Get and store the string and the length from the text field
            String string = inputField.getText();
            int count = string.length();

            // Clear the text field once above is stored
            inputField.setText("");

            // IF input was empty (0), make label visible to tell the user to retry
            if (count == 0)
            {
                outputLabel.setText("Please type at least one character!");
                outputLabel.setVisible(true);
            }
            // ELSE make label visible, as the inputted string and it's length
            else
            {
                outputLabel.setText(string + " (" + count + ")");
                outputLabel.setVisible(true);
            }
        });
    }

}
