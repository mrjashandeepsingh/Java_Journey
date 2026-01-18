
class Computer {
    public void playMusic() {
        System.out.println("Playing Music ...");
    }

    public String getPen(int money) {

        if(money >= 10) 
            return "Pen";
        return "Nothing";
    }
}


public class Methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getPen(10);
        System.out.println(str);
    }
}