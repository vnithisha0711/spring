package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetterOfString {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig"));
        StringBuilder result = new StringBuilder();

        Consumer<String> firstLetter = word -> result.append(word.charAt(0));

        words.forEach(firstLetter);

        System.out.println(result);
    }


}
