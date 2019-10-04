public class Car extends Vehicle implements IPrintable {
// Car's Additional Variable
private String  Color;
private byte NumberOfSeats;

// Getters and setters


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public byte getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(byte numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }
}
