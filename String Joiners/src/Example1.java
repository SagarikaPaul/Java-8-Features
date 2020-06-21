// Java added a new final class String Joiners in java.util.package.
// It is used to construct a sequence of characters seperated by delimiters.

// Example of string joiners

import java.util.StringJoiner;
public class Example1{
    public static void main(String[] args){
        //passing (,) as delimiter
        StringJoiner joinNames = new StringJoiner(",");

        joinNames.add("Rahul");
        joinNames.add("Riya");
        joinNames.add("Rajdeep");
        System.out.println(joinNames);
    }
}
