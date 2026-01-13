public class Switch {
    public static void main(String args[]) {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Bye");
            default:
                System.out.println("hmmmm");
        }
        String day = "Mon";
        // New way
        switch (day) {
            case "Mon" -> System.out.println("6pm");
            case "Sun" -> System.out.println("8pm");
        }

        // A more new way 
        String result = switch (day) {
                            case "Mon" : yield "6pm";
                            case "Sun" : yield "8pm";
                            default : yield "closed";
                            };
        System.out.println(result);
    }
}