import java.util.HashMap;
import java.util.Map;

/*
 Version: 3.0
 Centralized Room Inventory Management
*/

class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor to initialize inventory
    public RoomInventory() {
        inventory = new HashMap<>();
    }

    // Register a room type with available count
    public void addRoomType(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Get availability of a specific room type
    public int getAvailability(String roomType) {
        if (inventory.containsKey(roomType)) {
            return inventory.get(roomType);
        }
        return 0;
    }

    // Update availability after booking or cancellation
    public void updateAvailability(String roomType, int newCount) {
        if (inventory.containsKey(roomType)) {
            inventory.put(roomType, newCount);
        } else {
            System.out.println("Room type not found in inventory.");
        }
    }

    // Display current inventory
    public void displayInventory() {
        System.out.println("\nCurrent Room Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }
}


public class Book_My_Stay_App {

    public static void main(String[] args) {

        // Initialize inventory system
        RoomInventory inventory = new RoomInventory();

        // Register room types
        inventory.addRoomType("Single Room", 10);
        inventory.addRoomType("Double Room", 8);
        inventory.addRoomType("Deluxe Room", 5);
        inventory.addRoomType("Suite", 2);

        // Display initial inventory
        inventory.displayInventory();

        // Retrieve availability
        System.out.println("\nAvailable Deluxe Rooms: " + inventory.getAvailability("Deluxe Room"));

        // Update inventory (simulate booking)
        System.out.println("\nBooking 1 Deluxe Room...");
        int current = inventory.getAvailability("Deluxe Room");
        inventory.updateAvailability("Deluxe Room", current - 1);

        // Display updated inventory
        inventory.displayInventory();
    }
}
