import java.util.Scanner;
public class Method1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        System.out.println("Enter 8 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Number found at index " + index);
        } else {
            System.out.println("Number not found");
        }

        scanner.close();
}
}