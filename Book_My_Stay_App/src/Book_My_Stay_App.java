
// Abstract class representing a general Room
abstract class Room {
    private String type;
    private int beds;
    private double size; // in square meters
    private double price; // per night

    public Room(String type, int beds, double size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    // Display room details
    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Number of Beds: " + beds);
        System.out.println("Room Size: " + size + " sqm");
        System.out.println("Price per Night: $" + price);
    }

    // Getters (encapsulation)
    public String getType() { return type; }
    public int getBeds() { return beds; }
    public double getSize() { return size; }
    public double getPrice() { return price; }
}

// Concrete room classes extending Room
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 20.0, 50.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 35.0, 80.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 60.0, 150.0);
    }
}

// Application entry point
public class Book_My_Stay_App {

    // Static variables representing room availability
    static int availableSingleRooms = 5;
    static int availableDoubleRooms = 3;
    static int availableSuiteRooms = 2;

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" Welcome to Book My Stay - Hotel Booking System ");
        System.out.println(" Version: 2.1 ");
        System.out.println("==========================================\n");

        // Initialize room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display room details with availability
        System.out.println("Available Rooms Information:\n");

        single.displayDetails();
        System.out.println("Available: " + availableSingleRooms + "\n");

        doubleRoom.displayDetails();
        System.out.println("Available: " + availableDoubleRooms + "\n");

        suite.displayDetails();
        System.out.println("Available: " + availableSuiteRooms + "\n");

        System.out.println("Thank you for viewing our rooms!");
    }
}
