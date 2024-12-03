package com.scm.services;

import com.scm.entities.User;

public interface UserService {

    User saveUser(User user);
    User getUserById(String id);
    User updatUser(User user);
    void deleteUser(String id);
    boolean isUserExist(String userId);
    boolean isUserExistByEmail(String email);

    


}
