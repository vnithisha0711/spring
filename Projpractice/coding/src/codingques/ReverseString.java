package codingques;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		
		String input ="Monday today";
        String reversed = Arrays.stream(input.split(" ")).map(String::valueOf).sorted((a,b)->-1)
        		.collect(Collectors.joining(" "));
		System.out.println("Reversed String: "+reversed);
	

	}
//	public static String reverse(String str) {
//		return Stream.of(str).map(word->new StringBuilder(word).reverse()
//	}

}
