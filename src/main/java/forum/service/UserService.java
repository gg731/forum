package forum.service;

import forum.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1, "login1", "login1@ma.f", "123"));
        users.add(new User(2, "login2", "login2@ma.f", "123"));
    }

    public User findByEmail(String name) {
        User user;
        try {
            user = users.stream().filter(s -> s.getEmail().equals(name)).findFirst().get();
        } catch (NoSuchElementException e) {
            user = null;
        }

        return user;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
