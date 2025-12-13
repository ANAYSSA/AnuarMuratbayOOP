public class Main {
    public static void main(String[] args) {

        Film film1 = new Film("Avatar 3", 10.0);
        Film film2 = new Film("Batman", 8.0);

        Viewer v1 = new Viewer("Aнуар", 15.0);
        Viewer v2 = new Viewer("Тимур", 5.0);

        Cinema cinema = new Cinema("Mega Cinema", 2);

        System.out.println("=== Films ===");
        film1.printInfo();
        film2.printInfo();

        System.out.println("\n=== Reservations ===");
        cinema.reserve(v1, film1); // успешно
        cinema.reserve(v2, film2); // возможно не хватит денег
        cinema.reserve(v1, film2); // может закончиться место

        System.out.println("\n=== Compare viewers ===");
        if (v1.getBalance() > v2.getBalance())
            System.out.println(v1.getName() + " has more money.");
        else
            System.out.println(v2.getName() + " has more money.");
    }
}
