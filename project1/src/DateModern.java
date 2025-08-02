import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*immutable Date class that wraps java.time.LocalDate
 * 
*/

public class DateModern {
    private final LocalDate date;
    
    public DateModern(int year, int month, int day){
        try {
            this.date = LocalDate.of(year,month,day);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("invalid date: "+e.getMessage());
        }
    }

    public int getYear(){
        return date.getYear();
    }
    public int getMonth(){
        return date.getMonthValue();
    }
    public int getDay(){
        return date.getDayOfMonth();
    }

    @Override
    public String toString() {
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    public DateModern withDate(int year, int month, int day){
        return new DateModern(year, month, day);
        
    }

}
