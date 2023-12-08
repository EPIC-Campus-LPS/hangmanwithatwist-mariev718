import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class creates a dictionary for the Hangman game.
 * It reads in data from dictionary.txt and manages a data structure of words for Hangman
 *
 * @author Marie Viita
 */
public class Dictionary {
    ArrayList<String> words = new ArrayList<>();
    int wordLength;
    int remainingWords;

    public void create(int n) throws FileNotFoundException {

        wordLength = n;

        File file = new File("dictionary.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {

            String word = scanner.nextLine();
            if(word.length() == n) {

                words.add(word);

            }

        }

        scanner.close();

        remainingWords = words.size();

    }

    public void character(char c) {

        for(int i = 0; i < words.size(); i++) {

            if(words.get(i) != null) {

                for (int j = 0; j < wordLength; j++) {

                    if (words.get(i).charAt(j) == c) {

                        if(remainingWords != 1);

                        words.set(i, null);
                        remainingWords--;

                    }

                }

            }

        }

    }

}
