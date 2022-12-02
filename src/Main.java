import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static Command parseCommand(String text, PublicGroup group) {
        if (text.startsWith("add-post:")) {
            return new AddPostCommand(new Post(text.substring("add-post:".length()), LocalDate.now()), group);
        } else if (text.startsWith("remove-post:")) {
            return new RemovePostCommand(new Post(text.substring("remove-post:".length()), LocalDate.now()), group);
        } else {
            throw new RuntimeException("Not implemented");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PublicGroup group = new PublicGroup();
        while (true) {
            String text = scanner.nextLine();
            Command c = parseCommand(text, group);
            c.execute();
            System.out.println(group);
        }
    }
}