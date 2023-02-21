import java.util.Arrays;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        String input = "I am here to welcome all of my loving people with a lot of love and respect";
        List<String> wordsToCheck = Arrays.asList("love", "welcome", "respect", "crowd", "god");

        for (String word: wordsToCheck) {
            if (input.contains(word)) {
                System.out.println("The word \"" + word + "\" is present in the input string");
            }
            else {
                System.out.println("The word \"" + word + "\" is NOT present in the input string");

            }
        }
    }
}


