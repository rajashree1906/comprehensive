package com.userservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

 

    public User findByUsername(String username);
    public User findByUsernameAndPassword(String username,String password);
	 


}
