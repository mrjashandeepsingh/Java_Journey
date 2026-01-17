class Shopkeeper{
    public String pen(int money) {
        if (money >= 20)
            return "Pen";
        return "Pay Money";
    }

    public String notebook(int money) {
        if (money >= 85)
            return "Notebook";
        return "Pay Money";
        
    }

}


public class Class {    
    public static void main(String args[]) {
        Shopkeeper shop = new Shopkeeper();
        System.out.println(shop.pen(20));
        System.out.println(shop.notebook(85));



    }
}