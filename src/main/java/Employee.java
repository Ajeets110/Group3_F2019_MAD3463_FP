import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


public class Employee {

    //V a r i a b l e s    d e c l a r a t i o n

    private String name = "";
    private int age;

    //M e t h o d s    d e c l a r a t i o n

    int calcBirthYear(){

        Date date = new Date();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
        //if ((birthDate != null) && (currentDate != null)) {
          //  return Period.between(birthDate, currentDate).getYears();
        //} else {

        return 0;
    }



}
