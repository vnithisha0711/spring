package LambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
    	
        // Supplier functional interface to generate random integers
        Supplier<Integer> randomIntGenerator = () -> (int)(Math.random() * 10) + 1;
        System.out.println("Random integer: " + randomIntGenerator.get());
        
        // Consumer functional interface to print out a string
        Consumer<String> stringPrinter = (str) -> System.out.println("Printing string: " + str);
        stringPrinter.accept("Hello, world!");
        
        // Predicate functional interface to check if a string is empty
        Predicate<String> stringIsEmpty = (str) -> str == null || str.isEmpty();
        System.out.println("Is empty string: " + stringIsEmpty.test(""));
        
        // Function functional interface to convert a string to uppercase
        Function<String, String> stringToUppercase = (str) -> str.toUpperCase();
        System.out.println("Uppercase string: " + stringToUppercase.apply("hello, world!"));
    }


}
