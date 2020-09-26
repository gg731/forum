package forum.service;

import forum.data.UserRepository;
import forum.model.User;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {
    private final UserRepository users;

    public UserService(UserRepository users) {
        this.users = users;
    }

    public User findByEmail(String email) {
        return users.findByEmail(email);
    }

    public void addUser(User user) {
        users.save(user);
    }
}
