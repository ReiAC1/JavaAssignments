# Exceptions

## Assignment

In this assignment, I used a BufferedReader, built using System.in, to read a value from the user.
This value is then converted into an integer and printed back out to the console.

Checks are in place for the following: If the BufferedReader is null, if the user does not input a valid number, and if the BufferedReader throws an IO exception.

The former 2 are both runtime exceptions, meaning it is not checked. Whereas the IOException is a checked exception, and can be caught at compile-time.
