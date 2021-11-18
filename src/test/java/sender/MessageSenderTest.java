package sender;

import userAdapter.MyFacebookUser;
import userAdapter.MyTwitterUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class MessageSenderTest {
    MessageSender messageSender;
    private final String ukraine = "Ukraine";
    private final String germany = "Germany";

    Date activeTime, inactiveTime;

    @BeforeEach
    void setUp(){
        messageSender = new MessageSender();
        activeTime = new Date();
        inactiveTime = new Date();
        inactiveTime.setHours(inactiveTime.getHours() - 2);
    }

    @Test
    void facebookActiveUser() {
        MyFacebookUser user = new MyFacebookUser("user@gmail.com", ukraine, activeTime);

        assert messageSender.send("Hello!", user, ukraine);
        assert !messageSender.send("Hello!", user, germany);
    }

    @Test
    void facebookInactiveUser() {
        MyFacebookUser user = new MyFacebookUser("user@gmail.com", ukraine, inactiveTime);

        assert !messageSender.send("Hello!", user, ukraine);
        assert !messageSender.send("Hello!", user, germany);
    }

    @Test
    void twitterActiveSend() {
        MyTwitterUser user = new MyTwitterUser("@user", ukraine, activeTime);

        assert messageSender.send("Hello!", user, ukraine);
        assert !messageSender.send("Hello!", user, germany);
    }

    @Test
    void twitterInactiveSend() {
        MyTwitterUser user = new MyTwitterUser("@user", ukraine, inactiveTime);

        assert !messageSender.send("Hello!", user, ukraine);
        assert !messageSender.send("Hello!", user, germany);
    }
}