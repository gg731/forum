package forum.control;

import forum.model.Post;
import forum.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    private final PostService posts;

    public PostController(PostService posts) {
        this.posts = posts;
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("posts", posts.getAll());
        return "index";
    }

    @GetMapping("create")
    public String create() {
        return "post";
    }

    @PostMapping("create")
    public String create(@ModelAttribute Post post) {
        post.setNow();
        posts.add(post);
        return "redirect:/";
    }

}
