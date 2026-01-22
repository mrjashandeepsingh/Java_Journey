import java.util.Scanner;

class Guess1{
    public static void no() {
        System.out.println("Welcome to game of Guessing");
        int rand = (int) ((Math.random()*100) +1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int num = -1;
        int count = 0;
        while (rand!=num) {
            num = sc.nextInt();
            count++;
            if (num < rand) 
                System.out.println("Enter big");
            else if (num > rand)
                System.out.println("Enter small");
        }
        String result = String.format("you won !!!%nno of guesses = %d",count);
        System.out.println(result);
        sc.close();
    }
}

public class Test {
    public static void main(String[] args) {
        Guess1.no();
    }
}