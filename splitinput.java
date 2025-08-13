import java.util.Scanner;

public class splitinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words separated by spaces:");

        String inputLine = sc.nextLine();

        String[] parts = inputLine.split(" ");

        System.out.println("You entered:");
        for (String part : parts) {
            System.out.println(part);
        }

        sc.close();
    }
}