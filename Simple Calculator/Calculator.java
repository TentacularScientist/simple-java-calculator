import java.util.Scanner;
/* Calculator takes three inputs from the main method, the operator and two numbers. The inputs are then passed throught the calculation method
 * and are then either added, subtracted, multiplied, divided, or modulus based on the value of the operator. The output is a double value which is then
 * printed out to the end user. 
*/

public class Calculator {
    public static Double calculation(char operator, Double variable1, Double variable2) {
        Double result = 0.0;

        // calculation depending on operator
        if (operator == '+' ) {
            result = variable1 + variable2;
        } else if (operator == '-') {
            result = variable1 - variable2;
        } else if (operator == '*') {
            result = variable1 * variable2;
        } else if (operator == '/') {
            result = variable1 / variable2;
        } else if (operator == '%') {
            result = variable1 % variable2;
        } else {
            result = null;
        }

        return result;
    }
    
    public static void main(String[] args) {

        // Scanner class created
        Scanner input = new Scanner(System.in);

        // Operator input
        System.out.println("To add press +");
        System.out.println("To subtract press -");
        System.out.println("To multiply press *");
        System.out.println("To divide press /");
        System.out.println("To return remainder press %");
        char operator = input.next().charAt(0);

        // Number inputs
        System.out.println("First number:");
        Double variable1 = input.nextDouble();
        System.out.println("Second number:");
        Double variable2 = input.nextDouble();

        input.close();

        // Values are passed through the calculation method
        Double result = calculation(operator, variable1, variable2);
        System.out.println("The result is " + result);
    }
}