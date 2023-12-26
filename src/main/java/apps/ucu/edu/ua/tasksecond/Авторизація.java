package apps.ucu.edu.ua.tasksecond;

public class Авторизація {
    public boolean авторизуватися(БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
