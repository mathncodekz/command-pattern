import java.util.ArrayList;
import java.util.List;

public class PublicGroup {
    private List<Post> posts;

    public PublicGroup(List<Post> posts) {
        this.posts = posts;
    }

    public PublicGroup() {
        posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "PublicGroup{" +
                "posts=" + posts +
                '}';
    }
}
