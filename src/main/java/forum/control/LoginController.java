package forum.control;

import forum.data.UserRoleRepository;
import forum.model.User;
import forum.model.UserRole;
import forum.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    private UserService users;
    private UserRoleRepository userRole;

    public LoginController(UserService users, UserRoleRepository userRole) {
        this.users = users;
        this.userRole = userRole;
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout,
                        Model model) {
        String errorMessage = null;
        if (error != null) {
            errorMessage = "Username or Password is incorrect !";
        }
        if (logout != null) {
            errorMessage = "You have been successfully logged out !";
        }
        model.addAttribute("error", errorMessage);
        return "login";
    }

    @PostMapping("/login")
    public String postLogin() {
        return "redirect:/post";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            new SecurityContextLogoutHandler().logout(request, response, authentication);
        }
        return "redirect:/login?logout=true";
    }

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

    @PostMapping("/reg")
    public String regPost(@ModelAttribute User user,
                          Model model) {
        user.setPassword(
                new BCryptPasswordEncoder().encode(user.getPassword()));
        users.addUser(user);

        userRole.save(
                new UserRole(users.findByUsername(user.getUsername()).getId(), "ROLE_USER"));

        model.addAttribute("successful",
                "Registration Successful. Please Login");

        return "login";
    }
}
