import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/** This class has a main method that creates a Mid Libs story.
 * The program utilizes the words from the user in a story.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Janyl Jumadinova
 */

public class MadLibs {

  /** The main entry point for MadLibs.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window.
   *
   **/
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());
    // declare the starting file and scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter three words, followed by two integers, "
          + " number with decimal points, and another word");
    // Step One: Read in and save the input from the terminal
    String w1 = scanner.next();
    String w2 = scanner.next();
    String w3 = scanner.next();
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    double num3 = scanner.nextDouble();
    String w4 = scanner.next();

    // TODO: add this later and replace num1 and num2 below
    Counting count = new Counting();
    int num4 = count.sum(num1, num2);
    double num5 = count.multiply(num3, num1);

    // Step Two: Display the words and numbers in a Mad Libs story
    System.out.println("If you own " + num4 + " " + w1 + ", ");
    System.out.println("and you purchase " + num5 + " " + w2 + " " + w1);
    //System.out.printf("%.2f", num5);
    System.out.println("how many more do you need to " + w3 + " " + num3 + " "
                      + w4);
    // Step Three: Display a final thankyou message
    System.out.print("\nThanks for using the MadLibs program.");

    // What happens if put wrong data type
    // TODO: arithmetic manipulation
  }

}
