import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnonymousLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String heading = scanner.nextLine().trim();
        String text = scanner.nextLine().trim();

        // Output
        System.out.println(canWriteLetter(heading, text) ? "YES" : "NO");
    }

    public static boolean canWriteLetter(String heading, String text) {
        Map<Character, Integer> headingLetters = new HashMap<>();

        // Count the occurrence of each letter in the heading
        for (char ch : heading.toCharArray()) {
            if (Character.isLetter(ch)) {
                //char lowercaseCh = Character.toLowerCase(ch);
                headingLetters.put(ch, headingLetters.getOrDefault(ch, 0) + 1);
            }
        }

        // Check if there are enough letters to compose the text
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                //char lowercaseCh = Character.toLowerCase(ch);
                if (!headingLetters.containsKey(ch) || headingLetters.get(ch) == 0) {
                    return false;
                } else {
                    headingLetters.put(ch, headingLetters.get(ch) - 1);
                }
            }
        }

        return true;
    }
}
