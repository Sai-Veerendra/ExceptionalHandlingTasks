import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b = sc.nextInt();
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println(c);
        sc.close();
    }
}