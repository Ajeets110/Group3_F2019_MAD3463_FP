public class Intern<set> extends Employee implements IPrintable {

    //V a r i a b l e    D e c l a r a t  i o  n

    private String schoolName;
    private int make;
    private String plate;
    private String color;
    private int seats;
    private String brand;
    private double price;

    //G e t t e r   a n d    S e t t e r


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

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setCar(int mak, String plat, String colo, int seat) {
        this.make = mak;
        this.plate = plat;
        this.color = colo;
        this.seats = seat;
    }
    public void setMotorcycle(int mak, String plat, String brand, int price) {
        this.make = mak;
        this.plate = plat;
        this.brand = brand;
        this.price = price;
    }


    //O v e r r i d i n g
    @Override
    public void printMyData()
    {
        super.printMyData();
        System.out.println("Employee is an Intern");
        System.out.println("School Name        :" + schoolName);
        System.out.println("Salary             : " + super.getEarnings() );
        Motorcycle motorcycle = new Motorcycle(make, plate, brand, price);
        Car car = new Car(make, plate, color, seats);
        if(car.getColor()!=null) {
            System.out.println("Employee has a car");
            car.printMyData();
            System.out.println("=========================");
        }
        else if(motorcycle.getBrand()!=null)
        {
            System.out.println("Employee has a motorcycle");
            motorcycle.printMyData();
            System.out.println("=========================");
        }
        else{
            System.out.println("No Vehicle");
        }
    }


}
