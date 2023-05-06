package Task31._Boot.dao;

import Task31._Boot.models.User;

import java.util.List;

public interface UserDao {

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void save(User user);

    void update(User user);
}
