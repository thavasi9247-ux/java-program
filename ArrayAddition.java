public class ArrayAddition {
        public static void main(String[] args) {
            int[] array1 = {10, 20, 30,40,50};
            int[] array2 = {69,96,12,10,91};
            int[] sumArray = new int[array1.length]; 
            if (array1.length != array2.length) {
                System.out.println("Arrays must have the same length for element-wise addition.");
                return;
            }
            for (int i = 0; i < array1.length; i++) {
                sumArray[i] = array1[i] + array2[i];
            }
            System.out.print("Sum of arrays: ");
            for (int i = 0; i < sumArray.length; i++) {
                System.out.print(sumArray[i] + " ");
            }
            System.out.println();
        }
    }