
// If Value is Present

import java.util.Optional;
public class Example2 {
    public static void main(String[] args) {
        String[] str = new String[10];
        // Setting value for 5th index
        str[5] = "India";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        // It Checks, value is present or not
        if(checkNull.isPresent()){
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("String value is not present");
    }
}