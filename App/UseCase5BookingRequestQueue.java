import java.util.LinkedList;
import java.util.Queue;

// Reservation class
class Reservation {
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public void displayReservation() {
        System.out.println("Guest: " + guestName + " | Room: " + roomType);
    }
}

// Booking Request Queue
class BookingQueue {
    private Queue<Reservation> queue;

    public BookingQueue() {
        queue = new LinkedList<>();
    }

    // Add booking request
    public void addRequest(Reservation reservation) {
        queue.add(reservation);
        System.out.println("Request added for " + reservation);
    }

    // Display all requests
    public void displayQueue() {
        System.out.println("\n=== Booking Queue (FIFO) ===");

        for (Reservation r : queue) {
            r.displayReservation();
        }
    }
}

// Main Class
public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {

        BookingQueue bookingQueue = new BookingQueue();

        // Simulating booking requests
        bookingQueue.addRequest(new Reservation("Ram", "Single Room"));
        bookingQueue.addRequest(new Reservation("Charan", "Double Room"));
        bookingQueue.addRequest(new Reservation("Alex", "Suite Room"));

        // Display queue
        bookingQueue.displayQueue();
    }
}