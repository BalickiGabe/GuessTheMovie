# GuessTheMovie

`GuessTheMovie` is a simple Java-based game where players try to guess the title of a randomly selected movie by guessing one letter at a time. The game provides feedback on correct and incorrect guesses, and players have up to 10 incorrect guesses to complete the movie title.

## How It Works

1. The program reads a list of movie titles from a file called `movies.txt`.
2. A random movie title is selected from the list.
3. The movie title is displayed as a series of underscores, with spaces preserved.
4. The player guesses letters one at a time:
   - Correct guesses reveal the letters in the movie title.
   - Incorrect guesses are tracked, and the player is informed of how many incorrect guesses they've made.
5. The game ends when:
   - The player correctly guesses the entire movie title, or
   - The player makes 10 incorrect guesses.

## Features

- Random movie selection from a pre-defined list.
- User-friendly interface to input guesses.
- Tracks the number of incorrect guesses.
- Displays real-time progress of the guessed movie title.

## Prerequisites

- Java Development Kit (JDK) 8 or later.
- A `movies.txt` file containing a list of movie titles, each on a new line. For example:



## Setup Instructions

1. Clone or download the repository.
2. Ensure the `movies.txt` file is placed in the same directory as the Java source file.
3. Compile the program:
 ```bash
 javac GuessTheMovie.java
