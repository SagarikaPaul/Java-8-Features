//Lamda expression with multiple parameters

interface Addable {
    int add(int a,int b);
}

public class Example5 {
    public static void main(String[] args){
        Addable ad1 = ((a, b) -> (a+b));
        System.out.println(ad1.add(100,300));

    }
}
