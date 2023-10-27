import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);
                if (romanValues.get(current) < romanValues.get(next)) {
                    total += romanValues.get(next) - romanValues.get(current);
                    i++;
                } else {
                    total += romanValues.get(current);
                }
            } else {
                total += romanValues.get(current);
            }
        }
        return total;
    }
}