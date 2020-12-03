package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String record: records) {
            String[] userInfo = record.split(":");
            if (userInfo[0].equals(email)) {
                return Integer.parseInt(userInfo[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesnt exist");
    }
}
