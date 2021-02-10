package by.tsarionok.service;

/**
 * Service for security
 *
 * @author Sergey Tsarionok
 * @version 1.0
 */


public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);

}
