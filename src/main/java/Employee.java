import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


public abstract class Employee implements IPrintable{

    //V a r i a b l e s    d e c l a r a t i o n

    private String name = "";
    private int age;
    double earnings;

    //M e t h o d s    d e c l a r a t i o n

    int calcBirthYear() {

        Date date = new Date();
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthyear = 0 ;
        if(age == 0)
        {
            System.out.println("Age not found!");
        }
        else{
            birthyear += currYear - age;
            //System.out.println("Birth year of " +name + " is " +birthyear);   //Displaying to check result
        }

        return birthyear;
    }

    int calcEarnings(){

        return 1000;
    }

    @Override
    public void printMyData()
    {
        System.out.println("Name of the employee is " + name + " and his age is " + age);
        System.out.println("Salary of " + name + " is " + earnings);
    }

}
