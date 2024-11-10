package org.example.Service;

import org.example.Dto.User;
import java.util.List;

public interface UserService{

    List<User> getUser();
         void addUser(User user);

         void deleteById(Integer id);
}
