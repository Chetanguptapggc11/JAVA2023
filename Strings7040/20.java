import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {
    public static List<String> generateSubsets(String str) {
        List<String> subsets = new ArrayList<>();
        backtrack(subsets, new StringBuilder(), str, 0);
        return subsets;
    }

    private static void backtrack(List<String> subsets, StringBuilder current, String str, int index) {
        subsets.add(current.toString());
        for (int i = index; i < str.length(); i++) {
            current.append(str.charAt(i));
            backtrack(subsets, current, str, i + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> subsets = generateSubsets(str);
        for (String subset : subsets) {
            System.out.println(subset);
        }
    }
}

