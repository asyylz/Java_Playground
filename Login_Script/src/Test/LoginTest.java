import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    User user1 = new User("JohnDoe", "password123");
    User user3 = new User("JaneSmith", "securePass!");
    Users multipleUsers = new Users(user1);

    //  findUser method should find user
    @Test
    void findUser() {
        assertEquals(user1.getUsername(), multipleUsers.findUser("johndoe").getUsername());
        assertEquals(new User("", "").getUsername(), multipleUsers.findUser("JaneDoe").getUsername());
    }

    // displayUsers method should print structured  output
    @Test
    void displayUser() {
        String expected = "Username: JohnDoe, Password: password123\n";
        assertEquals(expected, multipleUsers.displayUsers());
    }

}
