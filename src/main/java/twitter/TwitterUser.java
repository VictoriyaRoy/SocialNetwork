package twitter;

import lombok.Getter;

import java.util.Date;

@Getter
public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;

    public TwitterUser(String userMail, String country, Date lastActiveTime) {
        this.userMail = userMail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }
}
