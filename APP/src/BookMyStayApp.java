
abstract class Room {

    String type;
    int beds;
    double price;

    Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    void display() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: " + price);
    }
}

class SingleRoom extends Room {

    SingleRoom() {
        super("Single Room", 1, 1000);
    }
}

class DoubleRoom extends Room {

    DoubleRoom() {
        super("Double Room", 2, 1800);
    }
}

class SuiteRoom extends Room {

    SuiteRoom() {
        super("Suite Room", 3, 3500);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        single.display();
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        doubleRoom.display();
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        suite.display();
        System.out.println("Available: " + suiteAvailability);
    }
}