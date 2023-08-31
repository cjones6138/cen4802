import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        num = userNumber();
        num = fibonacci(num);
        System.out.println("Your number is: " + num);
    }
    public static int fibonacci (int n){
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static int userNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nth Term: ");
        int num = scan.nextInt();
        return num;
    }
}
