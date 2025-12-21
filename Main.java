public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Zodiac", 5);
        cinema.addMovie(new Film("Human x", 8.0));
        cinema.addMovie(new Film("Spider man", 15.0));
        cinema.addMovie(new Film("Minions", 5.0));

        System.out.println("Все фильмы");
        cinema.showAllFilms();
        System.out.println("\nСортировка");
        cinema.sortByPrice();
        cinema.showAllFilms();

        System.out.println("\nФильтр (до 10)");
        cinema.showCheapFilms(10.0);

        System.out.println("\nПоиск");
        cinema.findFilm("Spider man");

        System.out.println("\nБронирование");
        Viewer v1 = new Viewer("Ануар", 200.0);
        Viewer v2 = new Viewer("Тимур",145.0);
        Film target = new Film("Spider man", 15.0);
        cinema.reserve(v1, target);
    }
}
