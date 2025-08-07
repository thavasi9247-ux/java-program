import java.util.*;

public class ticketbooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] seats = new int[5];
        int count = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Booking");
            System.out.println("2. Remove Booking");
            System.out.println("3. Update Booking");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Booking
                    if (count == 5) {
                        System.out.println("No more bookings can be added.");
                        break;
                    }
                    System.out.print("Enter name: ");
                    names[count] = sc.nextLine();
                    System.out.print("Enter seat number: ");
                    seats[count] = sc.nextInt();
                    sc.nextLine();
                    count++;
                    System.out.println("Booking added.");
                    break;
                case 2: // Remove Booking
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(removeName)) {
                            for (int j = i; j < count - 1; j++) {
                                names[j] = names[j + 1];
                                seats[j] = seats[j + 1];
                            }
                            count--;
                            removed = true;
                            System.out.println("Booking removed.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Booking not found.");
                    }
                    break;
                case 3: // Update Booking
                    System.out.print("Enter name to update: ");
                    String updateName = sc.nextLine();
                    boolean updated = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new seat number: ");
                            seats[i] = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Booking updated.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Booking not found.");
                    }
                    break;
                case 4: // View Bookings
                    System.out.println("\nBookings:");
                    if (count == 0) {
                        System.out.println("No bookings yet.");
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.println(names[i] + " - Seat " + seats[i]);
                    }
                    break;
                case 5: // Exit
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
