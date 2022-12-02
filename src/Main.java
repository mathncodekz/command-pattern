import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PublicGroup group = new PublicGroup();
        while (true) {
            String postText = scanner.nextLine();
            Post post = new Post(postText, LocalDate.now());
            group.getPosts().add(post);
            System.out.println(group);
        }
    }
}