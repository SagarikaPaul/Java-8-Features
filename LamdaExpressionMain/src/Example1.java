
// A lamda expression describes a block of code ( an anonymous function) that can be passed to a constructor or method for
// subsequent execution . The constructor or method receives the lamda as an argument
// -> Enables to treat functionality as a method argument
// -> A function that can be created without belonging ti any class
// -> A lamda expressiion can be passed around as if it was an object and executed on demand


interface FuncInterface {
    //An abstract function
    void abstractFun(int x);

    //An non abstract function (or default fucntion)
    default void normalFun(){
        System.out.println("Hello Guys");
    }
}

public class Example1{
    public static void main(String args[]){
        //Lamda expression to implement above functional interface. This interface by default implements abstractFunc()
        FuncInterface fobj =(int x) -> System.out.println(2*x);

        //This calls above lamda function and prints 10
        fobj.abstractFun(5);
    }
}

