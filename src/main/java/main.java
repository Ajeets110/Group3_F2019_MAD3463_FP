import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class main {

    public static void main(String[] args) {

        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream("output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(out);

        FullTIme f1 = new FullTIme();
        f1.setName("Skrillex");
        f1.setAge(25);
        f1.setSalary(85000);
        f1.setBonus(5000);
        f1.calcEarnings();
        f1.calcBirthYear();
        f1.setMake(2019);
        f1.setCar(2019, "ABD512", "Blue", 4);
        f1.printMyData();

        FullTIme f2 = new FullTIme();
        f2.setName("Martin Garrix");
        f2.setAge(22);
        f2.setSalary(852000);
        f2.setBonus(50000);
        f2.calcEarnings();
        f2.calcBirthYear();
        f2.setMake(2019);
        f2.setMotorcycle(2019, "ABD512", "Blue", 4);
        f2.printMyData();

        Intern i1 = new Intern();
        i1.setMotorcycle(2019, "BGV51", "Repsol", 50000);
        i1.setName("Hardwell");
        i1.setAge(62);
        i1.setSchoolName("Lambton College");
        i1.calcBirthYear();
        i1.calcEarnings();
        i1.printMyData();

        Intern i2 = new Intern();
        i1.setCar(2018, "BGV52", "Black", 4);
        i1.setName("Cardi B");
        i1.setAge(26);
        i1.setSchoolName("Hoods");
        i1.calcBirthYear();
        i1.calcEarnings();
        i1.printMyData();

        CommissionBasedPartTime c1 = new CommissionBasedPartTime();
        c1.setName("French Montana");
        c1.setAge(28);
        c1.setRate(30);
        c1.setHoursWorked(45);
        c1.setCommissionPerc(20);
        c1.setMotorcycle(2015, "VGC1","Harley Davidson", 45000);
        c1.calcEarnings();
        c1.calcBirthYear();
        c1.printMyData();

        CommissionBasedPartTime c2 = new CommissionBasedPartTime();
        c2.setName("G-Eazy");
        c2.setAge(27);
        c2.setRate(80);
        c2.setHoursWorked(40);
        c2.setCommissionPerc(30);
        c2.setCar(2018, "CDC1","Bentley", 65000);
        c2.calcEarnings();
        c2.calcBirthYear();
        c2.printMyData();

        FixedBasedPartTime b1 = new FixedBasedPartTime();
        b1.setName("Shaktimaan");
        b1.setAge(68);
        b1.setRate(80);
        b1.setHoursWorked(40);
        b1.setFixedAmount(250.00);
        b1.calcBirthYear();
        b1.calcEarnings();
        b1.setCar(2015,"DCC524", "Pink", 2);
        b1.printMyData();

        FixedBasedPartTime b2 = new FixedBasedPartTime();

        b2.setAge(52);
        b2.setRate(13);
        b2.setHoursWorked(10);
        b2.setFixedAmount(2500.00);
        b2.calcBirthYear();
        b2.calcEarnings();
        b2.setCar(2015,"SDE540", "Magenta", 3);
        b2.printMyData();

    }
}
