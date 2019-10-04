public abstract class Vehicle implements IPrintable {
    // Variable Declaration
    int Make;
    String Plate;

   // Getters And Setters
    public int getMake() {
        return Make;
    }

    public void setMake(int make) {
        Make = make;
    }

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String plate) {
        Plate = plate;
    }
}
