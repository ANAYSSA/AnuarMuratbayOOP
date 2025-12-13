public class Film {
    private String title;
    private double price;

    public Film(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() { return title; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public void printInfo() {
        System.out.println("Film: " + title + ", Price: " + price);
    }
}
