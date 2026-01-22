class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    static{
        name = "Phone";
    }

    public Mobile() {
        brand = "";
        price = 200;
    }
    


}
public class Classu {
    public static void main(String[] args) {
        Mobile ob1 = new Mobile();
        ob1.brand = "Apple";
        ob1.price = 1500;
        ob1.name = "Smartphone";

    }
}