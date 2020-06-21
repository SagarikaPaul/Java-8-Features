import java.util.Optional;
public class Example3 {
    public static void main(String[] args) {
        String[] str = new String[10];
        // Setting value for 5th index
        str[5] = "I am an Indian";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        // printing value by using method reference
        checkNull.ifPresent(System.out::println);
        // printing value by using get method
        System.out.println(checkNull.get());
        System.out.println(str[5].toLowerCase());
    }
}