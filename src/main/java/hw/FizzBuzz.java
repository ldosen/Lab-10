package hw;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static int max;

    /**
     * Returns a List of Strings in the Fizz Buzz sequence.
     * The String arg is entered as a command line argument and must be a natural number.
     * @param arg a String entered on the command  line
     * @return a List of Strings in the Fizz Buzz sequence
     */

    public static List<String> fizzBuzz(String arg) {
        if (arg.length() > 0) {
            try {
                max = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.err.println("The argument entered must be an integer");
                System.exit(1);
            }
        }
        List<String> fizzBuzzList = null;
        if (max < 0) {
            System.err.println("The argument must be a natural number");
            return null;
        } else {
            fizzBuzzList = new ArrayList<>();
        }
        for (int i = 1; i <= max; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                fizzBuzzList.add("fizz buzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }
        return fizzBuzzList;
    }
}




