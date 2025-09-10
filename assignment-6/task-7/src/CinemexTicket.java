public class CinemexTicket extends MovieTicket {
    private static int tCount = 0;
    private String genre;
    private String id;
    private String status;
    public CinemexTicket(String movie, String showtime, String genre, String date) {
        super(movie, date, showtime, 0.0);
        this.genre = genre;
        this.status = "Not Paid";
        super.seat = "Regular";
        tCount++;
        generateTicketID();
    }
    public CinemexTicket(String movie, String showtime, String genre, String date, String seatType) {
        super(movie, date, showtime, 0.0);
        this.genre = genre;
        this.status = "Not Paid";
        super.seat = seatType;
        tCount++;
        generateTicketID();
    }
    private void generateTicketID() {
        this.id = getMovie() + "-" + seat.charAt(0) + "-" + tCount;
    }
    public void calculateTicketPrice() {
        double basePrice = 0.0;

        for (int i = 0; i < seatTypes.length; i++) {
            if (seat.equals(seatTypes[i])) {
                basePrice = seatPrices[i];
                break;
            }
        }
        String[] parts = showtime.split(":");
        int hour = Integer.parseInt(parts[0]);
        if (hour >= 18 && hour <= 23) {
            basePrice += basePrice * nightShowCharge / 100.0;
        }

        setPrice(basePrice);
        System.out.println("Ticket price is calculated successfully.");
    }
    public String confirmPayment() {
        if (status.equals("Paid")) {
            return "Ticket price is already paid!";
        } else {
            status = "Paid";
            return "Payment Successful.";
        }
    }
    public static int getTotalTickets() {
        return tCount;
    }
    @Override
    public String toString() {
        return "Ticket ID: " + id + "\nMovie: " + getMovie() + "\nShowtime: " + showtime + "\nDate: " + date + "\nGenre: " + genre + "\nSeat Type: " + seat + "\nPrice(tk): " + getPrice() + "\nStatus: " + status;
    }
}
