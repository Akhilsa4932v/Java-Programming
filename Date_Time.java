import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Calendar;


public class Date_Time{
 
    public static void main(String args[]){
        
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Date d  = new Date();
        Calendar c = Calendar.getInstance();

        System.out.println(date);
        System.out.println(time);
        System.out.println(c.getTime());
        System.out.println(d);
      

    }
    

}
