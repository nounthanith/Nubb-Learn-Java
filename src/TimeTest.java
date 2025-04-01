import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class TimeTest {
    public static void main(String[] args){
        LocalDate currentLocalDate = LocalDate.now();
        Period period = Period.between(currentLocalDate, currentLocalDate);

        System.out.println(currentLocalDate);
        System.out.println(period);
    }
}
