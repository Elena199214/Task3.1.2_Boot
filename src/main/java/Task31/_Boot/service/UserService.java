package Task31._Boot.service;


import Task31._Boot.models.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void update(User user);
}

