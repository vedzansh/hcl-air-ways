import java.time.*;
import java.time.format.FormatStyle;
public class time {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);

        System.out.println("Current Date and Time is: " + formatted);
    }
    
}
