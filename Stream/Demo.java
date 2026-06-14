package Stream;
import java.util.*;
import java.util.stream.*;
public class Demo {

    public static void main(String[] args) {
        List<String> names = List.of("Vijay","Trisha","Jason");
        List<String> filterdStream = names.stream()
        .filter(name -> name.startsWith("T"))
        .map(String::toUpperCase).
        collect(Collectors.toList());
        System.out.println(filterdStream);
    }
}
