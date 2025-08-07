import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nArray elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
