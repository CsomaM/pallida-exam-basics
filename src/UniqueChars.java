import java.util.ArrayList;

public class UniqueChars {

    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        System.out.println(uniqueCharacters("anagram"));
        // Should print out:
        // ["n", "g", "r", "m"]
    }

    static String uniqueCharacters(String s) {
        char[] c = s.toCharArray();
        ArrayList<Character> uniqueList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int counter = 0;
            for (int j = 0; j < s.length(); j++) {
                if (c[j] == s.charAt(i)) {
                    counter++;
                }
            }
            if (counter == 1) {
                uniqueList.add(s.charAt(i));
            }
        }
        return uniqueList.toString();
    }
}