
// Counting Elements

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
class Laptop{
    int id;
    String name;
    float price;

    public Laptop(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}
    public class Example2 {
        public static void main(String[] args) {
        List<Laptop> laptopsList = new ArrayList<Laptop>();
        //Adding Products
        laptopsList.add(new Laptop(1,"HP Laptop",25000f));
        laptopsList.add(new Laptop(2,"Dell Laptop",30000f));
        laptopsList.add(new Laptop(3,"Lenevo Laptop",28000f));
        laptopsList.add(new Laptop(4,"Sony Laptop",28000f));
        laptopsList.add(new Laptop(5,"Apple Laptop",90000f));
        Long noOfElements = laptopsList.stream()
        .collect(Collectors.counting());
        System.out.println("Total elements : "+noOfElements);
        }
}