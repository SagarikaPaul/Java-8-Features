//Lamda expression with no parameter

interface  Sayabale{
 public String say();
}

public class Example3 {
    public static void main(String args[]){
        Sayabale s =()->{
            return "Lamda expression with no parameters";
        };
        System.out.println(s.say());
    }
}
