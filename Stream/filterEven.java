package Stream;

import java.util.List;
import java.util.stream.Collectors;

// Expected: [2,4,6]
public class filterEven {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 6, 3, 4, 5, 2);

        List<Integer> num = numbers.stream()
                            .filter(n -> n % 2 == 0)
                            .sorted()
                            .collect(Collectors.toList());
        System.out.println(num);
    }

}
