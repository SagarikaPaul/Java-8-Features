
// An interface that contains exactly one abstract method is known as functional interface.
// It can have number of default, static methods but can contain only one abstract method.
// Functional interface is also known as single abstract method interface or sam interface.
// It is a new feature in java 8 which helps to acheive functional programming approach.


import java.util.stream.Stream;

@FunctionalInterface
interface sayable{
    void say(String msg);
}

public class Example1 implements sayable {

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
    public static void main(String [] args){
        Example1 ex1 = new Example1();
        ex1.say("Hello");
    }



}

