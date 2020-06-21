
interface Drawable{
    public void draw();
}

public class Example2 {
    public static void main(String args[]){
        int height = 15;

        //with lamda
        Drawable dr = () ->{
            System.out.println("Drawing " +height);
        };
        dr.draw();
    }
}
