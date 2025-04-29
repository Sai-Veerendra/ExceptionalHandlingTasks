import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a value : ");
            int a = sc.nextInt();
            int b = 100 / a;
            System.out.println("Result : " + b);
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter int value only");
        }
        sc.close();
    }
}
