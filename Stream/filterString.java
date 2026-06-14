package Stream;

import java.util.List;
import java.util.stream.Collectors;

// Expected: 2 (banana, elephant)
public class filterString {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cat", "elephant");

        List<String> filterdWords = words.stream()
                                    .filter(w -> w.length() > 5)
                                    .collect(Collectors.toList());
        System.out.println(filterdWords);

    }

}