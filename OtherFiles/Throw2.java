import java.util.Scanner;

public class Throw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        try {
            if (name.equalsIgnoreCase("Sai"))
                throw new NameException();
            System.out.println("Hii " + name);
        } catch (Exception e) {
            // System.out.println("It's my name, Please try again.");
        } finally {
            sc.close();
        }
    }
}

class NameException extends Exception {
    NameException() {
        System.out.println("Why are you entering my name as input?");
    }
}