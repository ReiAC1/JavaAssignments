package assignments.exceptions;

import sun.security.pkcs.ParsingException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {

    static BufferedReader bf;

    public static int readInputAsInt() {
        int out = 0;

        // try to get input
        try {
            System.out.print("Enter any number\n> ");
            out = Integer.parseInt(bf.readLine());
        }
        catch (NullPointerException e) {
            // if, somehow, our buffered reader isn't set, inform the user
            System.out.println("Buffered reader is not initialized");
        }
        catch (NumberFormatException e) {
            // inform the user that they must enter a valid number and then prompt them again using recursion
            System.out.println("Enter a valid number");
            return readInputAsInt();
        }
        catch (IOException e) {
            // something went very wrong while trying to read from the console
            System.out.println("An error occurred reading from the console....");
        }

        // return the value input from the user, or 0 in case of error
        return out;
    }

    public static void main(String[] args) {

        // initialize our buffered reader
        bf = new BufferedReader(new InputStreamReader(System.in));

        int num = readInputAsInt();
        System.out.println("The number you input was: " + num);
    }
}
