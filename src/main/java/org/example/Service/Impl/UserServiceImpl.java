package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.User;
import org.example.Entity.UserEntity;
import org.example.Repositary.UserRepositary;
import org.example.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepositary repositary;
    final ModelMapper mapper;

    @Override
    public List<User> getUser() {
        List<User> userList = new ArrayList<>();
        repositary.findAll().forEach(user -> userList.add(mapper.map(user,User.class)));
        return userList;
    }

    @Override
    public void addUser(User user) {
        repositary.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public void deleteById(Integer id){
        repositary.deleteById(id);
    }

    public boolean authenticateUser(String name, String password) {
        List<User> users = repositary.findByName(name);
        if (users.size() == 1) {
            User user = users.get(0);
            return user.getPassword().equals(password);
        }
        return false;
    }
}
