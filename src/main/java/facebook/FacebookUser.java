package facebook;

import lombok.Getter;

import java.util.Date;

@Getter
public class FacebookUser {
    private String email;
    private String userCountry;
    private Date userActiveTime;

    public FacebookUser(String email, String userCountry, Date userActiveTime) {
        this.email = email;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }
}
