public class Car extends Vehicle implements IPrintable {
    // Car's Additional Variable
    private String  Color;
    private byte NumberOfSeats;

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
        System.out.println("Make       : " + Make);
        System.out.println("Plate        : " + Plate);
        System.out.println("Color : " + Color );
        System.out.println("Number Of Seats    : " + NumberOfSeats);
    }













}

