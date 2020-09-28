package forum.model;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long userRoleid;
    @Column(name = "userid")
    private Long userid;
    @Column(name = "role")
    private String role;

    public UserRole(Long userid, String role) {
        this.userid = userid;
        this.role = role;
    }

    public Long getUserRoleid() {
        return userRoleid;
    }

    public void setUserRoleid(Long userRoleid) {
        this.userRoleid = userRoleid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}