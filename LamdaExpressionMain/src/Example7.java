// For each loop

import java.util.*;
public class Example7 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Babita");
        list.add("Swapan");
        list.add("Sougata");
        list.add("Sagarika");

        list.forEach((n) ->
                        System.out.println(n));
    }
}
