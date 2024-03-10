import java.util.Arrays;
public class palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String original = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Using StringBuilder to reverse the string
        StringBuilder reversedStringBuilder = new StringBuilder(original).reverse();
        String reversedString = reversedStringBuilder.toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversedString);

        // Check if the original and reversed strings are equal
        if (original.equals(reversedString)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}

