package org.example.Repositary;

import org.example.Dto.User;
import org.example.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepositary extends JpaRepository<UserEntity,Integer> {

    List<User> findByName(String name);
}
