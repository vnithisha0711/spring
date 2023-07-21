package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintNumbersThread {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Thread thread = new Thread(() -> {
            Consumer<Integer> printNumber = System.out::println;
            numbers.forEach(printNumber);
        });

        thread.start();
    }


}
