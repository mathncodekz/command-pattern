public class RemovePostCommand implements Command {
    private Post post;
    private PublicGroup group;

    public RemovePostCommand(Post post, PublicGroup group) {
        this.post = post;
        this.group = group;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public PublicGroup getGroup() {
        return group;
    }

    public void setGroup(PublicGroup group) {
        this.group = group;
    }

    @Override
    public void execute() {
        group.getPosts().remove(post);
    }
}
