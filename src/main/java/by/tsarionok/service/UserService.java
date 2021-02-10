package by.tsarionok.service;

import by.tsarionok.model.User;

/**
 * Service class for {@link by.tsarionok.model.User}
 *
 * @author Sergey Tsarionok
 * @version 1.0
 */

public interface UserService {
    void save(User user);

    User findByUserName(String username);
}
