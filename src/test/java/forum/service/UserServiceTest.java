package forum.service;

import org.junit.jupiter.api.Test;
import forum.model.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.is;

class UserServiceTest {

    @Test
    void findByUsername() {
        User user1 = new User("1");
        assertThat(new User("1"), is(user1));
    }

}