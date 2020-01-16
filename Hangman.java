import java.util.Scanner;

public class Hangman{

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String guess = "hello";
        int chance = 0;
        int lives = guess.length();
        char[] guessedWords = new char[guess.length()];
        char[] toChar = new char[guess.length()];
        char[] underScore = new char[guess.length()];
        for (int i = 0; i < guess.length(); i++) {
            underScore[i] = '_';
            toChar[i] = guess.charAt(i);
        }
        System.out.println("Welcome to hangman version 0.1, lets start playing!");
        while (chance != guess.length()) {
            System.out.print("Guess the word: ");
            char scanChar = scan.next().charAt(0);
            for (int i = 0; i < guess.length(); i++) {
                if (toChar[i] == scanChar) {
                    if(guessedWords[i] == scanChar){
                        System.out.println("You already guessed it, try another word");
                        break;
                    }
                    System.out.print("You got it right good job!");
                    underScore[i] = scanChar;
                    System.out.println();
                    guessedWords[i] = scanChar;
                    for (int x = 0; x < guess.length(); x++) {
                        System.out.print(underScore[x]);
                    }
                    System.out.println("");
                } else {
                    chance++;
                    lives--;
                    System.out.println("Wrong word, remaining lives: " + lives);
                    break;
                }
            }
        }
    }
}
