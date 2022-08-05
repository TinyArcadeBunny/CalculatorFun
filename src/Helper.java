/**
 * Static Helper class hold printStartMessage to be called to TextCalcultor.
 *
 */
public class Helper {   // Helper is a static class. The methods will never change.
    public static void printStartMessage() {    // We can call this method directly from another class without having to make an object
        System.out.println("Welcome to Kinsee's calculator!!");
        System.out.println("If you would like help, just type \"Help\"");
        System.out.println("If you would like to exit the program, type \"Quit\"\n");
    }

    public static void getHelp() {
        System.out.println("\nHint! Try these operators as appears: +, -, *, /, root, or power.");
        System.out.println("For numbers, please use real numbers, pi, or e.");
        System.out.println("An example of real numbers would be your age or year of birth.\n");
    }
}
