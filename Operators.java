public class Operators {
    public static void main(String args[]) {
        int a = 8;
        int b = 6;

        int sum = a + b;
        System.out.println(sum);
        int dif = a - b;
        System.out.println(dif);
        int mul = a * b;
        System.out.println(mul);
        int div = a / b;
        System.out.println(div);
        int rem = a % b;
        System.out.println(rem);

        // Shorthand
        a +=3;  // It is same as like a = a + 3;
        a++; // It is increment operator a = a + 1;

        System.out.println(a);
        a--; // Post decrement 
        System.out.println(a);
        --a; // Pre decrement
        System.out.println(a);
        ++a;
        System.out.println(a);

        System.out.println(a==2);
        
        boolean result = a>b
        ;
        System.out.println(result);
        int x = 5, y = 2;
        a = 3; b = 4; 
        System.out.println((a<b)&&(x>y));
    }
}