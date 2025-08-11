public class combainedarray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        int[] arr1 = {69, 143, 108, 100, 911};

        int[] combined = new int[arr.length + arr1.length];

        System.arraycopy(arr, 0, combined, 0, arr.length);

        System.arraycopy(arr1, 0, combined, arr.length, arr1.length);

        System.out.println("Concatenated Array:");
        for (int num : combined) {
            System.out.print(num + " ");
        }
    }
}