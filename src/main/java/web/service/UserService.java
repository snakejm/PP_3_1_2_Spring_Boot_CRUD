package web.service;


import web.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteAllUsers();

    void deleteUserById(long id);
}
