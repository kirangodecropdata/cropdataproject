package com.save.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.save.operation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
