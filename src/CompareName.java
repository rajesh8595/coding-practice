import java.util.*;

public class CompareName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Rajesh Nayak",
                "Rajesh Kumar",
                "Rajesh Dash",
                "Rajesh Pattnaik"
        );

        // Sort using custom comparator
        names.sort((name1, name2) -> {
            String[] parts1 = name1.split(" ");
            String[] parts2 = name2.split(" ");

            // Compare first names
            int firstNameCompare = parts1[0].compareTo(parts2[0]);
            if (firstNameCompare != 0) {
                return firstNameCompare;
            }
            // If first names are same, compare the last names and print in alphabetical order
            return parts1[1].compareTo(parts2[1]);
        });

        // Print sorted list
        names.forEach(System.out::println);
    }
}