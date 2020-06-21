
// StringJoiner Methods

import java.util.StringJoiner;
public class Example4 {
    public static void main(String[] args) {
        // passing comma(,) as delimiter
        StringJoiner joinNames = new StringJoiner(",");

        // Prints nothing because it is empty
        System.out.println(joinNames);

        // We can set default empty value.
        joinNames.setEmptyValue("It is empty");
        System.out.println(joinNames);


        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        System.out.println(joinNames);

        // Returns length of StringJoiner
        int length = joinNames.length();
        System.out.println("Length: "+length);

        // Returns StringJoiner as String type
        String str = joinNames.toString();
        System.out.println(str);

        // we can apply String methods on it
        char ch = str.charAt(3);
        System.out.println("Character at index 3: "+ch);

        // Adding one more element
        joinNames.add("Sourabh");
        System.out.println(joinNames);

        // Returns length
        int newLength = joinNames.length();
        System.out.println("New Length: "+newLength);
    }
}