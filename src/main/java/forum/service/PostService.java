package forum.service;

import forum.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(Post.of("Post #1"));
    }

    public List<Post> getAll() {
        return posts;
    }

    public void add(Post post) {
        posts.add(post);
    }
}
