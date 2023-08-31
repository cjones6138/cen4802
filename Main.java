import java.util.Scanner;

public class Main {
    /**
     * Main method.
     * Call userNumber for nth place in fibonacci sequence.
     * Call fibonacci sequence to find nth number.
     * Print number to console.
     * @param args
     */
    public static void main(String[] args) {
        int num = 0;
        num = userNumber();
        num = fibonacci(num);
        System.out.println("Your number is: " + num);
    }
    /**
     * Recursive call for nth place fibonacci number.
     * @param n nth place for fibonacci sequence
     * @return the number in the nth place of the fibonacci sequence
     */
    public static int fibonacci (int n){
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    /**
     * Prompts user to input a number for desired fibonacci place.
     * @return number input by the user
     */
    public static int userNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nth Term: ");
        int num = scan.nextInt();
        return num;
    }
}
