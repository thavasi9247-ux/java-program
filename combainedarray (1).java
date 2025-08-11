public class sabarray {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int[] arr = {100,110, 120, 130, 140, 150}; 

        int[] sub = new int[b - a];
        for (int i = a; i < b; i++) {
            sub[i - a] = arr[i];
            System.out.println(sub[i - a]);
        }

        
        }
    }