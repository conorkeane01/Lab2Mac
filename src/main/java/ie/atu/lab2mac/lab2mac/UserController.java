package ie.atu.lab2mac.lab2mac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email) {
        userService.registerUser(name, email);
        return "name: " + name + " email:" + email;
    }
}
