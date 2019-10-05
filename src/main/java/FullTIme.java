public class FullTIme extends Employee implements IPrintable{

    //V a r i a b l e     d e c l a r a t i o n
    private double salary;
    private double bonus;

    int make;
    String plate;
    String color;
    byte seats;
    String brand;
    double price;



    Motorcycle mot = new Motorcycle(make, plate, brand, price);

    //G e t t e r    a n d   S e t t e r

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

   /** public void setCar(int mak, String plat, String colo, byte seat) {
        this.make = mak;
        this.plate = plat;
        this.color = colo;
        this.seats = seat;
    }**/


    public Motorcycle getMot() {
        return mot;
    }

    public void setMot(Motorcycle mot) {
        this.mot = mot;
    }

    // O v e r w r i t i n g    m e t h o d   o f   p a r e n t   c l a s s

    Double calcEarnings() {

        super.setEarnings(salary + bonus);
        return super.getEarnings();

    }
    Car car = new Car(make, plate, color, seats);

    @Override


    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is a Full Time Employee");
        System.out.println("Base Salary: " +salary);
        System.out.println("Bonus      : " +bonus);
        System.out.println("Earnings   : " +getEarnings());
        if(car.getPlate() == null) {
            System.out.println("Employee has a car");
            car.printMyData();
        }

    }
}
