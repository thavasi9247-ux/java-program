public class InnerOuterExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            
            for (int j = 1; j <= 4; j++) {
                System.out.println("  Inner loop iteration: " + j);
            }

            System.out.println(); 
        }
    }
}

