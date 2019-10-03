public class FullTIme extends Employee implements IPrintable{

    //V a r i a b l e     d e c l a r a t i o n
    Double salary;
    Double bonus;

    //Overwriting method of parent class

    Double calcEarnings() {

        super.earnings = salary + bonus;
        return super.earnings;

    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is a Full Time Employee");

    }
}
