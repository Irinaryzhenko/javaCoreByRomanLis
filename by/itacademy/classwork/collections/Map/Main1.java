package by.itacademy.classwork.collections.Map;
import java.util.HashMap;
import java.util.Map;
public class Main1 {
    public static void main(String[] args) {
        System.out.println(getCharsCount("Hello"));

    }
    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> result = new HashMap<>();
        char [] arrayOfCharacters = s.toCharArray();
        for ( char element : arrayOfCharacters) {
            if (result.containsKey(element)) {
                int count = result.get(element);
                result.put(element, ++count);
            } else
                result.put(element, 1);
        }
        return result;
    }
}
