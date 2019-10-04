public class Motorcycle extends Vehicle implements IPrintable {
    // Motorcycle's Additional variable
    private String Brand;
   private double price;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
