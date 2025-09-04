package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "Hello world! welcome To java.";
        String result = Arrays.stream(str.split("\\s+"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
