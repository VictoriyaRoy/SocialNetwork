package userAdapter;

import facebook.FacebookUser;

import java.util.Date;


public class MyFacebookUser extends FacebookUser implements User {
    public MyFacebookUser(String email, String userCountry, Date userActiveTime) {
        super(email, userCountry, userActiveTime);
    }

    @Override
    public String getMail() {
        return getEmail();
    }

    @Override
    public Date getActiveTime() {
        return getUserActiveTime();
    }
}
