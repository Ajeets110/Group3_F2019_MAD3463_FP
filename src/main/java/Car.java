public class Car extends Vehicle implements IPrintable {

    // Car's Additional Variable

private String  Color;
private byte NumberOfSeats;


    public Car(int make, String plate, String color, byte numberOfSeats) {
        super.setMake(make);
        super.setPlate(plate);
        Color = color;
        NumberOfSeats = numberOfSeats;
    }

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

    @Override
    public void printMyData() {
        System.out.println("Make               : " + super.getMake());
        System.out.println("Plate              : " + super.getPlate());
        System.out.println("Color              : " + Color );
        System.out.println("Number Of Seats    : " + NumberOfSeats);
    }

}
