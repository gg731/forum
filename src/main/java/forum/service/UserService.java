package forum.service;

import forum.data.UserRepository;
import forum.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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

    public User addUser(User user) {
        return users.save(user);
    }

    public List<User> findAll() {
        List<User> allUser = new ArrayList<>();
        users.findAll().forEach(allUser::add);
        return allUser;
    }

}
