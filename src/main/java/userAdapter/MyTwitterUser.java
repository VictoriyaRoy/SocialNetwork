package userAdapter;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser extends TwitterUser implements User {
    public MyTwitterUser(String userMail, String country, Date lastActiveTime) {
        super(userMail, country, lastActiveTime);
    }

    @Override
    public String getMail() {
        return getUserMail();
    }

    @Override
    public Date getActiveTime() {
        return getLastActiveTime();
    }

    @Override
    public String getUserCountry() {
        return getCountry();
    }
}
