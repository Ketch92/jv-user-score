package core.basesyntax;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("User with given email doesn't exist");
    }
}
