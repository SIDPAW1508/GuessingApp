# Guessing App

A console-based Number Guessing Game built in Java to practice core programming concepts including OOP, control flow, exception handling, file handling, and basic database integration.

## Use Cases

UC1 – Game Initialization  
Initializes game configuration, generates a random number, sets attempt and hint limits, and displays rules.

UC2 – User Guess Submission  
Accepts and validates user input, compares guesses, tracks attempts, and provides feedback (Correct / Higher / Lower).

UC3 – Hint Generation  
Provides limited hints after incorrect guesses using conditional logic and arithmetic rules.

UC4 – Error Handling & Validation  
Implements custom exceptions and input validation to prevent crashes and ensure robust execution.

UC5 – Game Result Storage  
Stores game results (player name, attempts, win/loss) using file I/O or database connectivity.

UC6 – Game Restart & Exit  
Allows safe restart or graceful shutdown with proper resource cleanup.

## Run

Compile:
javac *.java

Run:
java GuessApp
