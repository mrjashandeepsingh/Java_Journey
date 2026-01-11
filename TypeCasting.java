public class TypeCasting {
    public static void main(String args[]) {
        byte b = 127;
        int a = 257;
        // Implicit Conversion (Conversion)
        a = b;
        System.out.println(a);
        System.out.println(b);

        a = 257;
        b = 127;

        // Explicit Conversion (Casting)
        b = (byte) a;
        System.out.println(a);
        System.out.println(b);
        

    }
}