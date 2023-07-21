package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOddLengths {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig"));

        words.removeIf(word -> word.length() % 2 != 0);

        System.out.println(words);
    }


}
