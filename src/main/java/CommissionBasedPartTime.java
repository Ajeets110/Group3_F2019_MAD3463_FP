public class CommissionBasedPartTime extends PartTime implements IPrintable{

    private double commissionPerc;


    @Override
    Double calcEarnings() {

        double commission = (super.getHoursWorked()*super.getRate()) * commissionPerc/100;
        double finalSalary = super.getHoursWorked()*super.getRate() + commission;
        return finalSalary;
    }
}