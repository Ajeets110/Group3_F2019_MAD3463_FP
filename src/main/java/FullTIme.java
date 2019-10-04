public class FullTIme extends Employee implements IPrintable{

    //V a r i a b l e     d e c l a r a t i o n
    private double salary;
    private double bonus;

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

    // O v e r w r i t i n g    m e t h o d   o f   p a r e n t   c l a s s

    Double calcEarnings() {

        super.setEarnings(salary + bonus);
        return super.getEarnings();

    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is a Full Time Employee");

    }
}
