public abstract class Vehicle implements IPrintable {

private int Make;
  private   String Plate;

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
