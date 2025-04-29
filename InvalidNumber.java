import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        String strNum = sc.nextLine();
        try {
            int number = Integer.parseInt(strNum);
            System.out.println("Converted number : " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }
        sc.close();
    }
}