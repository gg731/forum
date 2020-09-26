package forum.control;

import forum.model.User;
import forum.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private UserService users;

    public LoginController(UserService users) {
        this.users = users;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam("email") String email,
                            @RequestParam("password") String pas,
                            HttpSession session,
                            Model model) {
        User user = users.findByEmail(email);

        if (user != null && user.getPassword().equals(pas)) {
            session.setAttribute("user", user);
            return "redirect:index";
        } else {
            model.addAttribute("error", "Error Login!");
            return "login";
        }
    }

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

    @PostMapping("/reg")
    public String regPost(@ModelAttribute User user,
                          Model model) {
        user.setId(2);
        users.addUser(user);
        model.addAttribute("successful",
                "Registration Successful. Please Login");

        return "login";
    }
}
