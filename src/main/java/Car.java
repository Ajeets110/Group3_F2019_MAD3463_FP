public class Car extends Vehicle implements IPrintable {

    // Car's Additional Variable

private String  color;
private int NumberOfSeats;
int make;
String plate;

    public Car(int make, String plate, String color, int numberOfSeat) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        NumberOfSeats = numberOfSeat;
    }

// Getters and setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(byte numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    @Override
    public void printMyData() {
        System.out.println("Make               : " + make);
        System.out.println("Plate              : " + plate);
        System.out.println("Color              : " + color );
        System.out.println("Number Of Seats    : " + NumberOfSeats);
    }

}
