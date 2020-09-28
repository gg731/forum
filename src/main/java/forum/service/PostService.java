package forum.service;

import forum.data.PostRepository;
import forum.model.Post;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PostService {

    private final PostRepository posts;

    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    public List<Post> getAll() {
        List<Post> postList = new ArrayList<>();
        posts.findAll().forEach(postList::add);
        return postList;
    }

    public void add(Post post) {
        posts.save(post);
    }
}
