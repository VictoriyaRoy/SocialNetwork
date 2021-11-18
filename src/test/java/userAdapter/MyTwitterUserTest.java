package userAdapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    MyTwitterUser adaptedUser;
    TwitterUser user;

    @BeforeEach
    void setUp() {
        String userMail = "@user";
        String userCountry = "Ukraine";
        Date activeTime = new Date();
        user = new TwitterUser(userMail, userCountry, activeTime);
        adaptedUser = new MyTwitterUser(userMail, userCountry, activeTime);
    }


    @Test
    void getMail() {
        assertEquals(user.getUserMail(), adaptedUser.getMail());
    }

    @Test
    void getActiveTime() {
        assertEquals(user.getLastActiveTime(), adaptedUser.getActiveTime());
    }

    @Test
    void getUserCountry() {
        assertEquals(user.getCountry(), adaptedUser.getUserCountry());
    }
}