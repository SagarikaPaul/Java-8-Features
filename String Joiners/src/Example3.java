
// Merge Two StringJoiner
// The merge() method merges two StringJoiner objects excluding of prefix and suffix of second StringJoiner object.


import java.util.StringJoiner;
public class Example3 {
    public static void main(String[] args) {

        //// passing comma(,) and square-brackets as delimiter
        StringJoiner joinNames = new StringJoiner(",", "[", "]");

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");

        // Creating StringJoiner with :(colon) delimiter
        // passing colon(:) and square-brackets as delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");

        // Adding values to StringJoiner
        joinNames2.add("Piya");
        joinNames2.add("Rashmi");

        // Merging two StringJoiner
        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);
    }
}