package apps.ucu.edu.ua.taskfirst;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TwitterUser {
    private String UserMail;
    private String Country;
    private LocalDateTime lastActiveTime;
}
