package hw;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(final String[] args) {
        List<String> fizzBuzzList = FizzBuzz.fizzBuzz(args[0]);
        try {
            for (String i : fizzBuzzList) {
                System.out.println(i);
            }
        } catch (NullPointerException e) {
            System.err.println("FizzBuzzList is not referenced");
            System.exit(1);
        }
    }
}