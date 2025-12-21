public class Film extends Media {
    private double price;
    public Film(String title, double price) {
        super(title);
        this.price = price;
    }
    public double getPrice() { return price; }
    @Override
    public void showDetail() {
        System.out.println("Кино: " + title + " стоит " + price);
    }
    @Override
    public String toString() {
        return "Фильм: '" + title + "', Цена: " + price;
    }
}
