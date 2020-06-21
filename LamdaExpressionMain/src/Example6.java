// Lamda expression with and without return keyword

interface Addable1 {
    int add(int a,int b);
}

public class Example6 {
    public static void main(String[] args){
        //Lamda expression without return keyword
        Addable ad1 = ((a, b) -> (a+b));
        System.out.println(ad1.add(10,30));


        //Lamda expression without return keyword
        Addable ad2 = (a, b) -> {return (a+b);};
        System.out.println(ad2.add(100,300));
    }
}
