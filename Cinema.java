public class Cinema {
    private String name;
    private int seats;

    public Cinema(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public int getSeats() { return seats; }

    public void reserve(Viewer viewer, Film film) {
        System.out.println(viewer.getName() + " tries to buy \"" + film.getTitle() + "\"");

        if (seats <= 0) {
            System.out.println("No seats left!");
            return;
        }
        if (viewer.buyTicket(film)) {
            seats--;
            System.out.println("Ticket bought! Balance now: " + viewer.getBalance());
        } else {
            System.out.println("Not enough money.");
        }
    }
}
