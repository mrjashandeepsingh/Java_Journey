public class Stringa {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Jashandeep Singh");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length());  
        sb.insert(0, "java");
        System.out.println(sb.substring(0, 4));
    }
}