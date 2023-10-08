package ie.atu.lab2mac.lab2mac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String username, String email) {
        // User Registration logic

        //Send confirmation Email
        emailService.sendEmail(email, "Welcome to our platform");
    }


}
