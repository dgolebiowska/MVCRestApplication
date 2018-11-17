package pl.sda.usersviewer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.usersviewer.service.UserService;

@Controller
public class UserConntroller {
    private UserService userService;

    @Autowired
    public UserConntroller(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/")
    public String listUserView(
            @RequestParam(defaultValue ="1")Integer page,
            @RequestParam(defaultValue ="5")Integer perpage,
                    Model model) {
        model.addAttribute("users", userService.showAllUsers(page, perpage));
        return "user";
    }
}
