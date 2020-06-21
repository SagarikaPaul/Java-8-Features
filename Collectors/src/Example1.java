
// a) Fetching data as a List
// b) Converting data into Set
// c) using sum method
// d) Getting Product Average Price


import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Example1 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        // a) Fetching data as a List
        List<Float> productPriceList =
                productsList.stream()
                        .map(x->x.price)         // fetching price
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);


        // b) Converting data into Set
        Set<Float>productPriceList2 =
                productsList.stream()
                        .map(x->x.price)         // fetching price
                        .collect(Collectors.toSet());   // collecting as list
        System.out.println(productPriceList2);

         // c) using sum method
        Double sumPrices =
                productsList.stream()
                        .collect(Collectors.summingDouble(x->x.price));  // collecting as list
        System.out.println("Sum of prices: "+sumPrices);
        Integer sumId =
                productsList.stream().collect(Collectors.summingInt(x->x.id));
        System.out.println("Sum of id's: "+sumId);

        // Getting average price
        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average price is: "+average);


    }
}