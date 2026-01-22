class Mobile {
    String brand;
    int price;
    String network;
    String name;
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1() {
        System.out.println("in static method" +" name");
    }
}
public class StringBuilder {
    public static void main(String[] args) {
        Mobile ob1 = new Mobile();
        ob1.brand = "Apple";
        ob1.price = 1500;
        ob1.name = "Smartphone";

        Mobile ob2 = new Mobile();
        ob2.brand = "Samsung";
        ob2.price = 1100;
        ob2.name = "Smartphone";

        ob1.show();
        ob2.show();
        Mobile.show1();

    }
}