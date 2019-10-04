public abstract class PartTime extends Employee implements IPrintable{

    //V a r i a b l e   D e c l a r a t i o n

    private double rate;
    private float hoursWorked;

    //G e t t e r   a n d   S e t t e r

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



    @Override
    public void printMyData()
    {
        super.printMyData();
        System.out.println("Employee is Part Time / Commissioned");
        System.out.println("Rate           : " + rate);
        System.out.println("Hours Worked   : " + hoursWorked);
    }
}
