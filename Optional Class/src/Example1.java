
//Java introduced a new class Optional in jdk8.
// It is a public final class and used to deal with NullPointerException in Java application.
// we must import java.util package to use this class.
// It provides methods which are used to check the presence of value for particular variable.

// Program to check If Value is not Present

import java.util.Optional;
public class Example1 {
    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        // check for value is present or not
        if(checkNull.isPresent()){
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }
}
