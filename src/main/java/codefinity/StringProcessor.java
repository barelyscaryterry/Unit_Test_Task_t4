package codefinity;

import java.util.List;
import java.util.stream.Collectors;

public class StringProcessor {

    public static List<String> filterAndSortPalindromes(List<String> input) {
        return input.stream()
                    .filter(StringProcessor::isPalindrome)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .collect(Collectors.toList());
    }

    private static boolean isPalindrome(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();
        return clean.contentEquals(new StringBuilder(clean).reverse());
    }
}