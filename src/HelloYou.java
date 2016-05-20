
// import libraray to use Scanner object 
import java.util.*;

//CLass to get to know the user
public class HelloYou {
	// FIXME
	// Create the class variable of Scanner object to allow user input to
	// console.
	static Scanner scanner = new Scanner(System.in);
	// Static class variable to hold STring array for use info
	static String[] userVars;
	static String[] details;

	/**
	 * Method to say farewell to user
	 */
	public static void exitApplication() {
		// Message to say farewell to the user
		System.out.println("/nThank you for using the SQA Greeting Application");
		// Exit the system
		System.exit(0);
	}

	// This is a method or function(COmponents that make up the method form a
	// method signature)
	public static String[] requestUserInfo(String name, String... details) {
		// Create an array of strings type objects to hold values for user ,
		// size is based on supplies arguments
		userVars = new String[details.length];
		// Great the user
		System.out.println("I am exicted to learn more about you" + name + "!");
		// perform loop for the amount of iterations equaks to the length of
		// supplied items
		for (int i = 0; i < details.length; i++) {
			// for each iterations ask the user for deatils
			System.out.println("Can I get your" + details[i] + ", Please? ");
			// capture user input in relative variable within array
			userVars[i] = scanner.nextLine();
		}
		return details;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.println("Hello , and welcome to SQA Selenium Boot camp");
		System.out.print("Could I please get your name");
		name = scanner.nextLine();
		details = requestUserInfo(name, "age", "city of residence", "favorite color", "current mood");
		outputUserDetails(name);
		exitApplication();
	}

	public static void outputUserDetails(String name) {
		System.out.println("\nWell" + name + ",it seems I have learned enough about you");
		for (int i = userVars.length - 1; i > 0; i--) {
			System.out.println("your" + details[i] + "is" + userVars[i] + ".");
		}
	}

}
