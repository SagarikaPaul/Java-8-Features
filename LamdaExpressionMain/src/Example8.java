//With comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Example8 {


    public static void main (String [] args){
        List <Product> list = new ArrayList<Product>();
        list.add(new Product(1, "hp laptop", 20000));
        list.add(new Product(3, "keyboard", 1000));
        list.add(new Product(2, "dell mouse", 500));
        list.add(new Product(4, "speakers", 1500));

        System.out.println("Sorting based on name");
        //implementing lamda expression
        Collections.sort(list,(p1,p2) -> {
            return p1.name.compareTo(p2.name);
        });

        for(Product p:list){
            System.out.println(p.id+"" +p.name+"" +p.price);
        }
    }
}
