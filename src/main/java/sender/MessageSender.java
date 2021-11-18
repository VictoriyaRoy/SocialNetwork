package sender;

import userAdapter.User;

import java.util.Date;

public class MessageSender {
    public boolean send(String text, User user, String country){
        String mail = user.getMail();
        Date activeTime = user.getActiveTime();
        String userCountry = user.getUserCountry();
        Date minTime = new Date();
        minTime.setHours(minTime.getHours() - 1);

        if (userCountry.equals(country) && activeTime.after(minTime)){
            System.out.printf("Message \"%s\" was send to %s\n", text, mail);
            return true;
        }
        System.out.printf("Error. Message to %s wasn't send\n", mail);
        return false;
    }
}
