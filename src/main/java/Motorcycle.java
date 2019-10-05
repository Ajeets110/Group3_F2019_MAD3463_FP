public class Motorcycle extends Vehicle implements IPrintable {
    // Motorcycle's Additional variable
    private String brand;
    private double price;

    public Motorcycle(int make, String plate, String brand, double price) {
        super.setMake(make);
        super.setPlate(plate);
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void printMyData() {
        System.out.println("Make         : " + super.getMake());
        System.out.println("Plate        : " + super.getPlate());
        System.out.println("Brand        : " + brand);
        System.out.println("Price        : " + price);
    }
}