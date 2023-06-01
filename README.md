# High_Low Guessing Game

## Overview
This is a fun guessing game where a player tries to guess a randomly generated number between 1 and 1000. After each guess, the game will provide feedback if the guess was too high, too low, or correct.

The game will also keep track of the number of attempts taken to guess the number correctly.

## Getting Started

Follow these instructions to run this application on your local machine for development and testing purposes.

### Prerequisites

Ensure you have Java Development Kit (JDK) installed on your machine. If not, download it from the official Oracle [website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Directory Structure

The project follows this directory structure:

project_directory
```
│ Main.java
└───modules
    │ Computer_Response.java
    │ Number_Generator.java
    
```

### How to Run

To run the application, follow these steps:

1. Compile the Java files:

    ```bash
    javac Main.java modules/Computer_Response.java modules/Number_Generator.java
    ```

2. Run the compiled Main class:

    ```bash
    java Main
    ```

### Structure
The application consists of the following Java files:

1. **Main.java:** This is the main driver class which starts the game. It interacts with the user for inputs and displays the responses.

2. **Computer_Response.java (in 'modules' package):** This class handles the logic of comparing the user's guess with the actual number and generates appropriate responses.

3. **Number_Generator.java (in 'modules' package):** This class is responsible for generating a random number between 1 and 1000.


## Gameplay

The game starts by generating a random number between 1 and 1000.

The player is then prompted to guess the number. The game provides feedback about whether the guess is too high, too low, just high, just low, or correct. This continues until the player guesses the correct number.

At the end, the game will display the number of attempts the player took to guess the number correctly.

Happy guessing!

## Built With

* [Java](https://www.oracle.com/java/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE) file for details.


