import java.util.Scanner;
public class InnerOuterExample {
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in); 
      System.out.print("enter the outer loop");
      int outerLimit = scanner.nextInt();
      System.out.print("enter the inner loop");
      int innerLimit = scanner.nextInt();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            
            for (int j = 1; j <= 4; j++) {
                System.out.println("  Inner loop iteration: " + j);
            }

            scanner.close(); 
        }
    }
}

