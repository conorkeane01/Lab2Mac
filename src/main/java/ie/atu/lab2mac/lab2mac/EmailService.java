package ie.atu.lab2mac.lab2mac;

import lombok.Data;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Data
@Service
public class EmailService {
    public String emailmessage(UserDetails user) {
        String message = "Thank you " + user.getName() + " for your registration";
        return message;
    }

}
