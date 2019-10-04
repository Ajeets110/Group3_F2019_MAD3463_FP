public class main {

    public static void main(String[] args) {
        CommissionBasedPartTime c1 = new CommissionBasedPartTime();
        c1.setRate(10.00);
        c1.setHoursWorked(5);
        c1.setCommissionPerc(10);
        c1.calcEarnings();
        c1.printMyData();


       /** Intern i1 = new Intern();
       i1.setSchoolName("abc");
       i1.calcEarnings();
       i1.printMyData(); **/

       /** FullTIme f1 = new FullTIme();
       f1.setSalary(85000);
       f1.setBonus(5000);
       f1.calcEarnings();
       f1.printMyData(); **/
    }
}
