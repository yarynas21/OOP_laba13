package apps.ucu.edu.ua.tasksecond;

public class Database extends БазаДаних {
    public String getUserData() {
        return отриматиДаніКористувача();
    }
    public String getStaticData() {
        return отриматиСтатистичніДані();
    }
}
