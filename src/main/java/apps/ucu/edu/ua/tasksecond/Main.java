package apps.ucu.edu.ua.tasksecond;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.login(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
