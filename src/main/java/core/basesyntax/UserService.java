package core.basesyntax;

public class UserService {

    public int getUserScore(String[] records, String email) throws UserNotFoundException {

        String userInfo = java.util.Arrays.stream(records).filter(i -> i.contains(email)).toString();

        if (userInfo == null || userInfo.isBlank() || userInfo.isEmpty()) {
            throw new UserNotFoundException();
        }

        return Integer.parseInt(userInfo.substring(userInfo.lastIndexOf(":") + 1));
    }
}
