public class Literals {
    public static void main(String args[]) {
        //  Different literals
        int bin = 0b101;
        int hex = 0x72;
        int num = 100_00_000;
        double exp = 1.2e12;
        System.out.println(bin);
        System.out.println(hex);
        System.out.println(num);
        System.out.println(exp);

        // Implicit Conversion
        double d = 56;  // Output- 56.0 Real - 56
        int i = 23/5;   // Output- 4 Real - 4.6
        System.out.println(d);
        System.out.println(i);
        System.out.println(i);

        char c = 'a';
        c++;
        System.out.println(c); // output- b instead of a
        int code = (int) c;
        System.out.println(code); // It prints unicode of b --> 98
        // Usual UNICODE :-
        // A - Z --> 65 - 90,
        // a - z --> 97 - 122,
        // 0 - 9 --> 48 - 57

    }
}