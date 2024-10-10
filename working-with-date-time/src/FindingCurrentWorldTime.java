import java.time.*;

public class FindingCurrentWorldTime {
    public static void main(String[] args) {
        ZoneId myTimeZone = ZoneId.systemDefault();
        ZoneId zurich = ZoneId.of("Europe/Zurich");
        ZoneId seoul = ZoneId.of("Asia/Seoul");
        ZoneId seattle = ZoneId.of("UTC-7");

        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentDateTimeInMyZone = ZonedDateTime.of(currentDateTime, myTimeZone);

//        System.out.println(currentDateTime);
//

        ZonedDateTime currentTimeInZurich = currentDateTimeInMyZone.withZoneSameInstant(zurich);
        ZonedDateTime currentTimeInSeoul = currentDateTimeInMyZone.withZoneSameInstant(seoul);
        ZonedDateTime currentTimeInSeattle = currentDateTimeInMyZone.withZoneSameInstant(seattle);

        System.out.println("Your current Date Time" + currentDateTimeInMyZone);
        System.out.println("Current Date & Time in Zurich" + currentTimeInZurich);
        System.out.println("Current Date & Time in Seoul" + currentTimeInSeoul);
        System.out.println("Current Date & Time in Seattle" + currentTimeInSeattle);
    }
}
