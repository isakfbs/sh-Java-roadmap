import java.time.*;

public class DateTimeOperations {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDateTime futureDateTime = currentDateTime
                .plusYears(1)
                .plusDays(2)
                .plusHours(3);

        boolean isBefore = futureDateTime.isBefore(currentDateTime);
        boolean isAfter = futureDateTime.isAfter(currentDateTime);

        System.out.println(isBefore);
        System.out.println(isAfter);
    }
}
