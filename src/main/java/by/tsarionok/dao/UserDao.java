package by.tsarionok.dao;

import by.tsarionok.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
