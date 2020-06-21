
//Functinal interface can hoave methods of object class

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

@FunctionalInterface
interface sayable1{
    // abstract method
    void say(String msg);
    // It can contain any number of object class methods.
    int hashCode();
    String toString();
    boolean equals (Object obj);
}

public class Example2  implements  sayable1{
    @Override
    public void say(String msg) {
            System.out.println(msg);
    }
    public static void main(String [] args){
        Example2 ex2 = new Example2();
        ex2.say("hello");
    }
}
