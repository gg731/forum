package forum.data;

import forum.model.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
    @Query("select a.role from UserRole a, User b where b.username=?1 and a.userid=b.id")
    List<String> findRoleByUserName(String email);
}

