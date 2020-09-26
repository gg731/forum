package forum.data;

import forum.model.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long> {
}
