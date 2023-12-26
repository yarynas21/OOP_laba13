package apps.ucu.edu.ua.taskfirst;

public class Auth {
    public User login() {
        int n = 0;
        if (n > 0) {
            return new MyTwitterUser(new TwitterUser());
        } else {
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void processData(User user) {
        user.getCountry();
    }
}
