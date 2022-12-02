import java.time.LocalDate;

public class Post {
    private String text;
    private LocalDate createdAt;

    public Post(String text, LocalDate createdAt) {
        this.text = text;
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "text='" + text + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
