import java.io.File;
import java.util.Scanner;

public class GuessTheMovie {
    public static void main(String[] args) throws Exception {
        File movies = new File("movies.txt");
        Scanner scanner = new Scanner(movies);
        String [] moviesArr = new String[26];
        int movieCount = 0;

        while (scanner.hasNextLine()) {
            String movie = scanner.nextLine();
            moviesArr[movieCount] = movie;
            movieCount++;
        }

        String pickedMovie = moviesArr[(int)(Math.random() * 26)];
        String [] pickedMovieChars = pickedMovie.split("");

        String [] movieBlanks = new String[pickedMovieChars.length];

        for (int i = 0; i < pickedMovieChars.length; i++) {
            if (pickedMovieChars[i].equals(" ")) {
                movieBlanks[i] = " ";
            } else {
                movieBlanks[i] = "_";
            }
        }

        int tries = 0;
        int guessedChars = 0;

        while (tries <= 10) {
            String hiddenMovie = String.join("", movieBlanks);
            System.out.println("You have guessed " + tries + " wrong letters:");
            System.out.println("Movie Title: " + hiddenMovie);

            System.out.println("Your next letter: ");
            Scanner uIscanner = new Scanner(System.in);
            String guess = uIscanner.nextLine();

            int currGuessed = 0;

            for (int i = 0; i < pickedMovieChars.length; i++) {
                if (guess.equals(pickedMovieChars[i])) {
                    movieBlanks[i] = pickedMovieChars[i];
                    guessedChars++;
                    currGuessed++;
                }
            }

            if (currGuessed == 0) {
                tries++;
                if (tries == 10) {
                    break;
                } else {
                    System.out.println("Nope! Try again.");
                }
            } else {
                if (guessedChars == pickedMovieChars.length) {
                    break;
                } else {
                    System.out.println("Wohoo! You got one!");
                }
            }
        }

        if (guessedChars == pickedMovieChars.length) {
            System.out.println("You Won! You guessed all letters in " + pickedMovie);
        } else {
            System.out.println("Darn! You failed to guess the movie title :(");
        }
    }
}