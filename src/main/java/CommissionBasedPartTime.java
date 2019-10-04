public class CommissionBasedPartTime extends PartTime implements IPrintable{

    private double commissionPerc;
    double finalSalary;
    double commission;

    // S e t t e  r   a n d    G e t t  e r
    public double getCommissionPerc() {
        return commissionPerc;
    }

    public void setCommissionPerc(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }

    @Override
     Double calcEarnings() {

        commission = (super.getHoursWorked() * super.getRate()) * commissionPerc/100;
        finalSalary = (super.getHoursWorked() * super.getRate() ) + commission;
        setEarnings(finalSalary);
        return finalSalary;
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Commission Percentage  : " + commissionPerc);
        System.out.println("Earnings       : " + finalSalary);
    }
}