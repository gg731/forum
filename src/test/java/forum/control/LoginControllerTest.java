package forum.control;

import forum.data.UserRoleRepository;
import forum.model.Post;
import forum.service.UserService;
import forum.model.User;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.stringContainsInOrder;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
@AutoConfigureMockMvc
class LoginControllerTest {

    @Autowired
    private MockMvc mock;

    @MockBean
    private UserService users;

    @Test
    @WithMockUser
    void login() throws Exception {
        this.mock.perform(get("/login"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("login"));
    }

    @Test
    @WithMockUser
    void logout() throws Exception {
        this.mock.perform(get("/logout"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/login?logout=true"));
    }

    @Test
    @WithMockUser
    void reg() throws Exception {
        this.mock.perform(get("/reg"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("reg"));
    }


//    @Test
//    @WithMockUser
//    void postReg() throws Exception {
//        this.mock.perform(post("/reg")
//                .param("username", "qwe")
//                .param("password", "123"))
//                .andDo(print())
//                .andExpect(status().isOk());
//        ArgumentCaptor<User> argument = ArgumentCaptor.forClass(User.class);
//        verify(users).addUser(argument.capture());
//        users.addUser(new User("qwe", "123", "123@123.e"));
//
//        assertThat(argument.getValue().getUsername(), is("qwe"));
//    }
}