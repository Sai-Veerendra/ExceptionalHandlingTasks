import java.util.Scanner;

public class IndexOutBound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter index : ");
            int index = sc.nextInt();
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
        sc.close();
    }
}
