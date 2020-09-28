package forum.service;

import forum.data.UserRepository;
import forum.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    private final UserRepository users;

    public UserService(UserRepository users) {
        this.users = users;
    }

    public User findByUsername(String username) {
        return users.findByUsername(username);
    }

    public void addUser(User user) {
        users.save(user);
    }

}
