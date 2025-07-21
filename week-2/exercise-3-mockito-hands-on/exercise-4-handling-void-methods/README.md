# Sub-Exercise 4: Handling Void Methods

## Scenario:
You want to test a method that calls a `void` method (e.g., logging, sending SMS), but without actually performing the real action.

## Objectives:
- Use `doNothing().when(mock).method(...)`
- Use `doThrow().when(mock).method(...)` for exceptions
