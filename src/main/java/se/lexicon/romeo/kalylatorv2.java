package se.lexicon.romeo;

import java.util.Scanner;

public class kalylatorv2 {

    public static float subtraction(float firstnr, float secondnr){
        return (firstnr - secondnr);
    }
    public static float subtraction(float subtractionArray[]){
            float sum = subtractionArray[0] - subtractionArray[1] - subtractionArray[2];
            return (sum);
    }
    public static float main(String[] args) {


        Scanner reader = new Scanner(System.in);
        String input = "";

        while(!input.equals("q")) {
                                // The menu part might be better as a method?
            System.out.println("Enter a mathematic operation:");
            System.out.println("number, space, operator, space, number");
            System.out.println("Example: 7.5 * 4 or 55.25 + 42.5");
            System.out.println("Enter q to quit!");

            input = reader.nextLine();  // Reading everything in one string
            if(input.equalsIgnoreCase("q")){
                System.out.println("Thank you and goodbye!");
                break; // Program ends if input is q
            }
            String[] threeParts = input.split(" ");  // Splitting the input string into three parts

            float firstNr = Float.parseFloat(threeParts[0]); // First part of the array
            char operator = threeParts[1].charAt(0);         // Second part, the operator
            float secondNr = Float.parseFloat(threeParts[2]);// Third part, the second number
            float result;  // Guess I should have used double instead of float?
            float[] subtractionArray[] = (0,0,0);

            switch (operator) {

                case '*':
                    result = firstNr * secondNr;
                    break;

                case '/':
                    result = firstNr / secondNr;
                    break;

                case '+':
                    result = firstNr + secondNr;
                    break;

                case '-':
                    result = subtraction(firstNr, secondNr);
                    result = subtraction(subtractionArray);
                    break;

                // operator is not one of the case constants (*, /, +, -)
                default:
                    System.out.println("Error! this operator is not valid. Quitting.");
                    return (0); // Program ends if you put something else here.
            }
            System.out.println(firstNr + " " + operator + " " + secondNr + " = " + result);
        }

    }
}