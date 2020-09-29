package forum.service;


import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import forum.model.*;

public class CustomUserDetails extends User implements UserDetails {
    private List<String> userRoles;
    private User user;

    public CustomUserDetails(User user, List<String> userRoles) {
        this.user = user;
        this.userRoles = userRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String roles = StringUtils.collectionToCommaDelimitedString(userRoles);
        return AuthorityUtils.commaSeparatedStringToAuthorityList(roles);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public void setPassword(String password) {
        this.user.setPassword(password);
    }

    @Override
    public Long getId() {
        return this.getId();
    }

    @Override
    public void setId(Long id) {
        this.user.setId(id);
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public void setUsername(String username) {
        this.user.setUsername(username);
    }

    @Override
    public String getEmail() {
        return this.user.getEmail();
    }

    @Override
    public void setEmail(String email) {
        this.user.setEmail(email);
    }
}
