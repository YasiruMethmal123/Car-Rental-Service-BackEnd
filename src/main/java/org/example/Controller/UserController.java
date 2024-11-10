package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Dto.User;
import org.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/getUser")
    public List<User> getUser(){
        return service.getUser();
    }

    @PostMapping("/addUser")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @DeleteMapping("/deleteUserById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        service.deleteById(id);
    }

    @PutMapping("/updateUser")
    @ResponseStatus(HttpStatus.OK )
    public void updateUser(@RequestBody User user){
        service.addUser(user);
    }

}
