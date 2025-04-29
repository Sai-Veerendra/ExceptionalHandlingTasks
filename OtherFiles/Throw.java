import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num : ");
        int a = sc.nextInt();
        System.out.println("Enter 2ndd num : ");
        int b = sc.nextInt();
        int c = 0;
        try {
            c = a / b;
            if (c == 5)
                throw new Exception(); // 10manually thowing some exception
            System.out.println("Result = " + c);
        } catch (Exception e) {
            System.out.println("I don't like 5");
        } finally {
            sc.close();
        }
    }
}