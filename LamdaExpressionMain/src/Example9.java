//Filter collection data by using stream

// Java provides an new additional package in java 8 called streams. This package consists of classes, intefaces and enums
// to allow functional style operation on the elements.
//  Features -
// a) It doesnt store elements . it simply conveys elements from a source such as a data structure, an array, or na i/o
//    channel, through a pipeline of computational operations
// b) Stream is functional in nature. Operations performed on a stream doesnt modify its source.
// c) steam is lazy and evaluates code only when required.


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Mobiles{
    int code;
    String brand;
    float price;

    public Mobiles(int code, String brand, float price){
        super();
        this.code = code;
        this.brand = brand;
        this.price = price;
    }
}
public class Example9 {
    public static void main (String [] args) {
        List<Mobiles> mob = new ArrayList<Mobiles>();
        mob.add(new Mobiles(005,"Samsung", 21000));
        mob.add(new Mobiles(003,"Mi", 12000));
        mob.add(new Mobiles(001,"Oneplus", 36000));
        mob.add(new Mobiles(004,"Moto", 38200));
        mob.add(new Mobiles(002,"Nokia", 18500));

        //using lamda to fliter data
        Stream<Mobiles> filted_data = mob.stream().filter(mobiles->mobiles.price>20000);

        //using lamda to iretate through the collection
        filted_data.forEach(
                mobiles -> System.out.println(mobiles.code+"" +mobiles.brand+""  +mobiles.price));

    }
}


