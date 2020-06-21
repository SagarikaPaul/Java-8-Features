
// Adding prefix and suffix

import java.util.StringJoiner;
public class Example2 {
    public static void main(String[] args) {
        // passing comma(,) and square-brackets as delimiter
        StringJoiner joinNames = new StringJoiner(",", "[", "]");

        // Adding values to StringJoiner
        joinNames.add("Anam");
        joinNames.add("Raju");
        joinNames.add("Pooja");
        joinNames.add("Rahul");

        System.out.println(joinNames);
    }
}