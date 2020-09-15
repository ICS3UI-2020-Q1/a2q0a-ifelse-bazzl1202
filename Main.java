import java.util.Scanner;
/**
 * Let's the user know if they can drive or not.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // Define the minimum driving age
    final int LICENSE_AGE = 16;

    //define the minimum voting age
    final int VOTING_AGE = 18;

    // prompt the user for their LICENSE_AGE
    System.out.println("Please enter your age:");
    // get the age from the user
    int age = input.nextInt();

    // check to see if they can vote or drive
    if( age >= VOTING_AGE){
      System.out.println("You can vote");
      System.out.println("You can legally drive");
    } else if(age >= LICENSE_AGE){
      // tell them they can drive
      System.out.println("You can legally get your license");
    } else {
      System.out.println("Sorry, you can not drive yet!");
    }
    


  }
}
