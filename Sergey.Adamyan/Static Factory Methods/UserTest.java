import org.junit.Test;

public class UserTest {
    @Test
    public void User() {
        User JaneWilliams = User.createUserWithId(10, "Jane", "Williams");
        User JohnBrown = User.createRegular("John", "Brown");
        User AlexaSmith = User.createUserFromSmith("Alexa");
    }
}
