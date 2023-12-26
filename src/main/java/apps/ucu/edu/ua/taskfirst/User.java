package apps.ucu.edu.ua.taskfirst;

import java.time.LocalDate;

public interface User {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveDate();
} 
