package userAdapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    MyFacebookUser adaptedUser;
    FacebookUser user;

    @BeforeEach
    void setUp() {
        String userMail = "user@gmail.com";
        String userCountry = "Ukraine";
        Date activeTime = new Date();
        user = new FacebookUser(userMail, userCountry, activeTime);
        adaptedUser = new MyFacebookUser(userMail, userCountry, activeTime);
    }

    @Test
    void getMail() {
        assertEquals(user.getEmail(), adaptedUser.getMail());
    }

    @Test
    void activeTime() {
        assertEquals(user.getUserActiveTime(), adaptedUser.getActiveTime());
    }
}