public class Loops {
    public static void main(String args[]) {
        int i = 1, j = 1;
        while (i<5) {
            System.out.println("Hi "+i);
            i++;
            while(j<5) {
                System.out.println("Hello "+j);
                j++;
            }
        }
        i =1;
        do {
            System.out.println("Lovely");
            i++;
        }while(i<5);
    }
}