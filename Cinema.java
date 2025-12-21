import java.util.*;
import java.util.stream.Collectors;
public class Cinema {
    private String name;
    private int seats;
    private List<Film> films = new ArrayList<>();
    public Cinema(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }
    public void addMovie(Film film) {
        films.add(film);
    }
    public void findFilm(String title) {
        for (Film f : films) {
            if (f.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Найден: " + f);
                return;
            }
        }
        System.out.println("Film not found");
    }
    public void sortByPrice() {
        films.sort(Comparator.comparingDouble(Film::getPrice));
        System.out.println("List sorted по цене");
    }
    public void showCheapFilms(double maxPrice) {
        System.out.println("Фильмы до " + maxPrice + ":");
        for (Film f : films) {
            if (f.getPrice() <= maxPrice) {
                System.out.println(f);
            }
        }
    }
    public void reserve(Viewer viewer, Film film) {
        if (seats > 0 && viewer.buyTicket(film)) {
            seats--;
            System.out.println(viewer.getName() + " купил билет на фильм" + film.getTitle());
        } else {
            System.out.println("Ошибка бронирования для " + viewer.getName());
        }
    }
    public void showAllFilms() {
        films.forEach(System.out::println);
    }
}
