package forum.service;


import java.util.List;

import forum.data.UserRepository;
import forum.data.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import forum.model.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    private final UserRoleRepository userRolesRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository,
                                    UserRoleRepository userRolesRepository) {
        this.userRepository = userRepository;
        this.userRolesRepository = userRolesRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (null == user) {
            throw new UsernameNotFoundException("No user present with username: " + username);
        } else {
            List<String> userRoles = userRolesRepository.findRoleByUserName(username);
            CustomUserDetails cs = new CustomUserDetails(user, userRoles);
            return new CustomUserDetails(user, userRoles);
        }
    }
}
