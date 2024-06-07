
package coursework.mathematics;

 
import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        // Generate two single-digit random integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Ensure number1 is greater than or equal to number2
        if (number1 < number2) {
            // Swap numbers
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student to answer
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        
        // Read the student's answer
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        // Check the student's answer and display whether it is correct
        if (answer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2) + ".");
        }
        
        // Close scanner
        input.close();
    }
}









