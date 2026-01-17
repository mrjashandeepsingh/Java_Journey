class Calculator {
    int c;

    public int add(int x, int y, int z=0){
        return (x + y + z);
    }
}
public class Classes {
    public static void main(String args[]) {
        int a = 2, b = 4, c = 6;
        Calculator calc = new Calculator();
        System.out.println("Sum = "+calc.add(a,b,c));

    }
}