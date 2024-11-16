# Assertion
## Description

The `AssertionEx` program demonstrates the use of Java assertions. It defines a static variable `a` and decrements its value with each call to the `getnum()` method. The program uses assertions to validate that the returned value of `getnum()` is positive.

If the assertion fails (i.e., `n <= 0`), the program will throw an `AssertionError` with a custom error message.

## Features

- Demonstrates the use of assertions in Java.
- Decrements a static variable `a` in a loop and verifies its value using assertions.
- Outputs the current value of `n` if the assertion passes.

## Expected Output
When running the program with assertions enabled (-ea flag):
n is 3
n is 2
n is 1
Exception in thread "main" java.lang.AssertionError: Error: whether n value is zero or negative
    at AssertionEx.main(AssertionEx.java:16)


When running without assertions (-da or no flag):
n is 3
n is 2
n is 1
n is 0
n is -1
n is -2
n is -3
n is -4
n is -5
n is -6

## Key Points
**Assertions:**

Assertions are used for testing assumptions in the code.
They are typically enabled in development or testing environments and disabled in production.
**Enabling Assertions:**

Use the -ea or -enableassertions flag when running the program to enable assertions.
**Disabling Assertions:**

Use the -da or -disableassertions flag to explicitly disable assertions.
