package ie.atu.lab2mac.lab2mac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;
    private final EmailService emailService;
    @Autowired
    public UserController(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email) {
        userService.registerUser(name, email);
        return "name: " + name + " email:" + email;
    }

    //Part B

    @PostMapping("/registerUserBody")
    public String getUser(@RequestBody UserDetails userDetails) {
        return emailService.emailmessage(userDetails);
    }

}
