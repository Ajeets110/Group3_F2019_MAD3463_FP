public class FixedBasedPartTime extends PartTime implements IPrintable {
private double FixedAmount;

    @Override
    Double calcEarnings() {


        double FinalSalary = super.getHoursWorked()*super.getRate() + FixedAmount ;
        return FinalSalary;
    }



}
