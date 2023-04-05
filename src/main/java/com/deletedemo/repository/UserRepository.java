package com.deletedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deletedemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
