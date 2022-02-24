package wordguess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        String[] playableWords = new String[]{
                "guessing", "these", "words",
                "is", "very", "easy"
        };

    List<String> words = new ArrayList<>();
    Random rand = new Random();
    String word = playableWords[rand.nextInt(playableWords.length)];
        System.out.println(word);

//List<Character> playerGuesses = new ArrayList<>();
//        System.out.println("Guesses Made");
//for (int i = 0; i < word.length(); i++){
//    if (playerGuesses.contains(word.charAt(i))){
//        System.out.print(word.charAt(i));
//    }
//    else {
//        System.out.print("_");
//    }
//}
//        System.out.println();
//        System.out.println("Guesses:");
    }
}
