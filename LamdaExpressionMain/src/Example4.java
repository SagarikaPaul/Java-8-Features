//Lamda expression with single parameter

interface Sayabale1{
    public String say(String name);
}
public class Example4 {
    public static void main (String[] args){
        Sayabale1 say1 = (name)->{
       return "hello"+name;
        };
        System.out.println(say1.say("Sagarika"));
    }
}
