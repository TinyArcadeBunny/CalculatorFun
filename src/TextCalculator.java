import java.util.Scanner;
import java.lang.Math;

/** @athur Kinsee Daniels
 * @Since 08/05/2022
 * Class TextCalculator contains the main method and processes string input from the scanner to calculate
 *
 *
 */
public class TextCalculator {


    public static void main (String []args){

        String operator;
        double number1 = 0, number2 = 0, result;    // Create objects of number values

        Helper.printStartMessage();     // Use Helper class's static method to print out welcome statement.
        Scanner input = new Scanner(System.in);     // Create object of scanner class

        calculator: while (true) {      // Run calculator for as long as we don't quit

            while (true) {      // Give user prompt to enter first number
                System.out.println("Enter the first number.");
                String inputString = input.nextLine();
                try {
                    number1 = Double.parseDouble(inputString);
                    break;
                } catch (NumberFormatException exception) {
                    if (inputString.equalsIgnoreCase("PI")) {
                        number1 = Math.PI;
                        break;
                    } else if (inputString.equalsIgnoreCase("E")) {
                        number1 = Math.E;
                        break;
                    }  else if (inputString.equalsIgnoreCase("HELP")) {
                        Helper.getHelp();   // Use Helper class's static method to print out helpful tips statement.
                        continue;
                    } else if (inputString.equalsIgnoreCase("Quit")) {
                        break calculator;
                    }
                    System.out.println("You entered something that wasn't a number. Please try again.");
                }
            }

            while (true) {      // Give user prompt to enter operator
                System.out.println("What calculation type would you like to make: +, -, *, /, root, or power");      //user needs to enter
                String inputString2 = input.nextLine();
                if (inputString2.equalsIgnoreCase("+") || inputString2.equalsIgnoreCase("-") ||
                    inputString2.equalsIgnoreCase("*") || inputString2.equalsIgnoreCase("/") ||
                    inputString2.equalsIgnoreCase("root") || inputString2.equalsIgnoreCase("power")) {
                    operator = inputString2;
                    break;
                }  else if (inputString2.equalsIgnoreCase("HELP")) {
                    Helper.getHelp();   // Use Helper class's static method to print out helpful tips statement.
                    continue;
                } else if (inputString2.equalsIgnoreCase("Quit")) {
                    break calculator;
                } else {
                    System.out.println("You did not input a correct operator. Please try again.");
                }
            }


            while (true) {     // Give user prompt to enter second number
                System.out.println("Enter the second number.");
                String inputString3 = input.nextLine();
                try {
                    number2 = Double.parseDouble(inputString3);
                    break;
                } catch (NumberFormatException exception) {
                    if (inputString3.equalsIgnoreCase("PI")) {
                        number2 = Math.PI;
                        break;
                    } else if (inputString3.equalsIgnoreCase("E")) {
                        number2 = Math.E;
                        break;
                    } else if (inputString3.equalsIgnoreCase("HELP")) {
                        Helper.getHelp();   // Use Helper class's static method to print out helpful tips statement.
                        continue;
                    } else if (inputString3.equalsIgnoreCase("Quit")) {
                        break calculator;
                    }
                    System.out.println("You entered something that wasn't a number. Please try again.");
                }
            }

            SimpleCalculator simpleCalculator = new SimpleCalculator(number1, number2);

            switch (operator) {
                case "+":       //performs addition
                    result = simpleCalculator.add();
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                case "-":        //performs subtraction
                    result = simpleCalculator.subtract();
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                case "*":       //performs multiplication
                    result = simpleCalculator.multiply();
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                case "/":       //performs division
                    result = simpleCalculator.divide();
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                case "root":    //performs root
                    result = simpleCalculator.root();
                    System.out.println(number1 + " to the root of " + number2 + " = " + result);
                    break;

                case "power":   //performs power
                    result = simpleCalculator.power();
                    System.out.println(number1 + " to the power of " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Need Help?");
                    break;
            }

            System.out.println("\nCongrats on your calculation!");
            System.out.println("Do another one...\n");
        }

        System.out.println("Quitting the calculator... Goodbye!");
        input.close();
    }
}
