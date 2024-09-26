import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        // List of integer objects
        List<Integer> numbers = Arrays.asList(120, 15, 7, 43, 88, 102, 98, 5, 70, 55, 17, 23, 35);

        // Filter odd numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0) // Checking for odd numbers
                .collect(Collectors.toList());

        // Filter numbers divisible by 3, 5, and 7
        List<Integer> divisibleBy3_5_7 = numbers.stream()
                .filter(num -> num % 3 == 0 || num % 5 == 0 || num % 7 == 0) // Divisible by 3, 5, or 7
                .collect(Collectors.toList());

        // Sort the list
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Filter integers greater than 100
        List<Integer> greaterThan100 = numbers.stream()
                .filter(num -> num > 100)
                .collect(Collectors.toList());

        // Print results
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Numbers divisible by 3, 5, or 7: " + divisibleBy3_5_7);
        System.out.println("Sorted numbers: " + sortedNumbers);
        System.out.println("Numbers greater than 100: " + greaterThan100);
    }
}
