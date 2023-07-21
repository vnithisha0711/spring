package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UppercaseWords {
	public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig"));

        UnaryOperator<String> toUpperCase = String::toUpperCase;

        words.replaceAll(toUpperCase);

        System.out.println(words);
    }


}
