package core.basesyntax.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String massage) {
        super(massage);
    }
}
