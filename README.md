# Part 2

##### _Discussion: What would be a really simple solution if n were not an argument, i.e., if it were always 17?_
If the fizzBuzz method was called with an integer as a parameter, the logic embedded in the fizzBuzz method to convert the command line String to an integer and the input validation would no longer be needed as the method would only accept an integer. That integer could be directly used to construct and print the fizz buzz sequence. 
# Part 3

##### _Discussion: How could you have automatically tested your initial solution from part 2?_
Without changing my code from part 2 at all, I would have to intercept the output stream to test it automatically. From what I understand, I'd have to declare a ByteArrayOutputStream and then reassign the standard output stream using System.setOut() to the print stream. Then I think I would be able to use assertEquals() on the output stream. This is quite cumbersome so it's much easier to write the method so that it returns something easily testable in JUnit.
# Part 4
##### _Discussion: What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?_

The core fizz buzz logic (i.e. the logic that determines which numbers are fizzed, buzzed, or simply printed) remains the same across all parts of the lab. Part two differs quite a bit from parts 3 and 4 as fizzBuzz is a void method that prints the results to the terminal whereas both parts 3 and 4 return something (an array or an ArrayList) back to Main for processing. Input validation changed across each part of this project as well. Each version implemented the same number format validation but each differed in how negative numbers were controlled for. In part 2, I simply threw an Exception if max > 0. In part  3, I instantiated an array of size max in a try catch block and was able to catch any NegativeArraySizeExceptions thrown. As the negative array size exception no longer would be a valid option in part 4, I simply made the method return null if max was less than 0 and created a try-catch block in main to control for a null pointer exception. I did this so the tests for negative arguments would still pass in the test suite. 

As far as list implementations go, we've only learned about ArrayList so far, so I decided to use that one. However, I do know that the Vector exists but is deprecated so it should not be used. A Linked List would be more applicable if this program carried out a lot of additions, subtractions, and substitutions as a Linked List has a smaller growth rate than an ArrayList. However, this program was only adding items to the List, so in that regard there's not many differences between the two.
