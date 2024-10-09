https://chamalwr.medium.com/datetime-api-in-java-2aef5df1c39b

-java.time.LocalDate — This represents only the time according to the ISO calendar.
-java.time.LocalTime — This represents only the time in a human-readable manner.
-java.time.LocalDateTime — Both the Date and Time without having a time zone will be handled here. This is a combination of LocalDate and LocalTime.
-java.time.ZonedDateTime — LocalDateTime combines with the time zone provided using ZoneId class.
-java.time.OffsetTime — Handles time with a corresponding time zone offset from Greenwich/UTC, without a time zone ID.
-java.time.OffsetDateTime — Handles a date and time with a corresponding time zone offset from Greenwich/UTC, without a time zone ID.
-java.time.Clock — Provides access to the current instant, date, and time in any given time zone.
-java.time.Instant — represents the start of a nanosecond on the timeline and useful for generating a timestamp to represent machine time
-java.time.Duration — Difference between two instants and measured in seconds or nanoseconds and does not use date-based constructs such as years, months, and days, though the class provides methods that convert to days, hours, and minutes.
-java.time.Period — To define the difference between dates in date-based values (years, months, days).
-java.time.ZoneId — specifies a time zone identifier and provides rules for converting between an Instant and a LocalDateTime.
-java.time.ZoneOffset — Specifies a time zone offset from Greenwich/UTC.