import java.util.Scanner;
class Calculator {
    public int add(int x, int y) {
        return x + y ;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}
public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No 1:- ");
        int a = sc.nextInt();
        System.out.print("Enter No 2:- ");
        int b = sc.nextInt();
        Calculator calc = new Calculator();
        int result = calc.add(a,b);
        System.out.println("Two Sum = "+ result);
        System.out.println("Three sum = "+ calc.add(a,b,5));
        
    }
}